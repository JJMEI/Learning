package com.mjj.rpc.basic.zookeeper.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.zookeeper.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.concurrent.CountDownLatch;

/**
 *
 * zk工具类
 * @author meijunjie
 */
public class ZKUtil {

    private static Logger logger = LoggerFactory.getLogger(ZKUtil.class);


    public static ZooKeeper getZookeeper(final String connectionUrl, final Integer sessionTimeout){
        if(StringUtils.isBlank(connectionUrl) || sessionTimeout == null){
            throw new IllegalArgumentException("method arguments error!");
        }
        CountDownLatch countDownLatch =  new CountDownLatch(1);

        ZooKeeper zooKeeper = null;
        try{
            zooKeeper = new ZooKeeper(connectionUrl, sessionTimeout, event -> {
                if(event.getState() == Watcher.Event.KeeperState.SyncConnected){
                    logger.info("connect zookeeper success! host: {},connect time: {}",connectionUrl, LocalDate.now());
                    countDownLatch.countDown();
                }
            });

            countDownLatch.await();
        }catch (IOException e){
            logger.error("connect zookeeper failed! exception: {}",e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return zooKeeper;
    }


    /**
     * 创建ZNode节点
     * @param path             节点路径
     * @param value            节点值
     * @param createMode       节点类型
     *                           PERSISTENT                 持久节点
     *                           PERSISTENT_SEQUENTIAL      持久顺序节点
     *                           EPHEMERAL                  临时节点
     *                           EPHEMERAL_SEQUENTIAL       临时顺序节点
     */
    public static void createZNode(String path, String value, CreateMode createMode, ZooKeeper zooKeeper) throws KeeperException, InterruptedException {
        if(StringUtils.isBlank(path) || StringUtils.isBlank(value) || createMode == null || zooKeeper == null){
            throw new IllegalArgumentException("method arguments error!");
        }
        zooKeeper.create(path,value.getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,createMode);
    }

    public static byte[] queryZNodeData(String path, ZooKeeper zooKeeper) throws KeeperException, InterruptedException {
        return zooKeeper.getData(path,null,null);
    }


    public static void main(String[] args) throws KeeperException, InterruptedException {

        ZooKeeper zooKeeper = getZookeeper("localhost:2181",5000);
        System.out.println(zooKeeper);

        for(int i=0;i<10;i++){
//            createZNode("/createZnodeTest"+i,"value"+i,CreateMode.PERSISTENT_SEQUENTIAL,zooKeeper);
        }


        System.out.println(new String(queryZNodeData("/createZnodeTest00000000012",zooKeeper)));
    }

}
