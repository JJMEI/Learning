package com.mjj.rpc.basic.zookeeper.basic;

import org.apache.zookeeper.*;
import com.mjj.rpc.basic.zookeeper.utils.ZKUtil;
import org.apache.zookeeper.data.Stat;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class LockSample {

    private ZooKeeper zkClient = null;
    private static final String LOCK_ROOT_PATH = "/Locks";
    private static final String LOCK_NODE_NAME = "Lock_";
    private String lockPath;

    private Watcher watcher = new Watcher() {
        @Override
        public void process(WatchedEvent event) {
            synchronized (this){
                // 唤醒所有等待线程
                notifyAll();
            }
        }
    };


    public LockSample() {
        zkClient = ZKUtil.getZookeeper("10.211.55.19:2181,10.211.55.22:2181,10.211.55.21",5000);
    }


    /**
     * 获取锁
     * @throws KeeperException
     * @throws InterruptedException
     */
    public void acquireLock() throws KeeperException, InterruptedException {
        createLock();
        attemptAcquireLock();
    }




    @Test
    private void createLock() throws KeeperException, InterruptedException {

        // 判断锁根存不存在
        Stat stat = zkClient.exists(LOCK_ROOT_PATH,false);
        if(stat == null){
            // 创建锁根目录
            zkClient.create(LOCK_ROOT_PATH,Thread.currentThread().getName().getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
        }

        // 创建锁节点 临时顺序节点
        lockPath = zkClient.create(LOCK_ROOT_PATH + "/" + LOCK_NODE_NAME,
                Thread.currentThread().getName().getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println("创建锁节点: " + lockPath);

    }


    private void attemptAcquireLock() throws KeeperException, InterruptedException {
        List<String> lockPaths;

        // 查询锁根下所有的锁节点
        lockPaths = zkClient.getChildren(LOCK_ROOT_PATH,false);

        Collections.sort(lockPaths);

        // 如果当前索引是0  这说明当前所节点是第一位的
        int index = lockPaths.indexOf(lockPath.substring(LOCK_ROOT_PATH.length() + 1));

        if(index == 0){
            System.out.println("持有锁: " + lockPath);
            return;
        }else {
            // 关注当前锁的前一位
            String preLock = lockPaths.get(index - 1);

            // 观察前锁的状态, 并设置观察点，当前节点一旦disconnected 则触发 线程
            Stat stat = null;
            try{
                stat = zkClient.exists(LOCK_ROOT_PATH + "/" + preLock,watcher);
            }catch (Exception e){

            }

            if(stat == null){
                // 前锁丢失或者释放
                attemptAcquireLock();
            }else {
                synchronized (watcher){
                    // 阻塞当前线程
                    watcher.wait();
                }
                attemptAcquireLock();

            }

        }
    }


    public void releaseLock() throws KeeperException, InterruptedException {
        zkClient.delete(lockPath,-1);
        zkClient.close();
        System.out.println("释放锁: " + lockPath);
    }


    public static void main(String[] args) {

        AtomicInteger tickNums = new AtomicInteger(10000);
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (;;){
            if(tickNums.get() > 0){

                executorService.execute(new Thread(new Runnable() {
                    LockSample lockSample = new LockSample();
                    @Override
                    public void run() {

                        try {
                            // 获取锁
                            lockSample.acquireLock();
                            if(tickNums.get() <= 0){

                            }else {
                                System.out.println(Thread.currentThread().getName() + "执行后，剩余票: " + tickNums.decrementAndGet());
                            }
                            // 释放锁
                            lockSample.releaseLock();
                        } catch (KeeperException | InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }));
            }else {
                executorService.shutdown();
                break;
            }
        }

    }


}
