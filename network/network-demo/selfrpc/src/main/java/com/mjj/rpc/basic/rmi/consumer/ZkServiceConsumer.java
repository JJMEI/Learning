package com.mjj.rpc.basic.rmi.consumer;

import com.mjj.rpc.basic.rmi.itf.BasicService;
import org.apache.commons.lang3.StringUtils;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class ZkServiceConsumer implements BasicService {

    private volatile List<String> rmiServiceUrls = new ArrayList<>();
    private CountDownLatch countDownLatch;

    public ZkServiceConsumer() {
        this.countDownLatch = new CountDownLatch(1);

        ZooKeeper zooKeeper = connectZKServer();
        if(zooKeeper != null){
            watchZKNode(zooKeeper);
        }
    }


    public <T extends Remote> T lookup(){
        T service = null;
        if(rmiServiceUrls.size() > 0){
            String url;
            if(rmiServiceUrls.size() == 0){
                url = rmiServiceUrls.get(0);
            }else {
                url = rmiServiceUrls.get(ThreadLocalRandom.current().nextInt(rmiServiceUrls.size()));
            }
            service = lookupService(url);
        }
        return service;
    }

    /**
     * 连接zooker
     * @return
     */
    private ZooKeeper connectZKServer(){
        ZooKeeper zk = null;
        try{
            zk = new ZooKeeper(ZK_CONNECT_HOST_AND_PORT, ZK_CONNECT_TIMEOUT, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    if(event.getState() == Event.KeeperState.SyncConnected){
                        // 已经和Zookeeper建立连接
                        countDownLatch.countDown();
                    }
                }
            });
            countDownLatch.await();
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
        return zk;
    }




    private void watchZKNode(final ZooKeeper zooKeeper){
        try{
            List<String> nodeList = zooKeeper.getChildren(ZK_PROVIDER_PATH, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    // /registry 下子节点发生变化
                    if(event.getType() == Event.EventType.NodeChildrenChanged){

                        // 重新获取所有孩子节点
                        watchZKNode(zooKeeper);
                    }
                }
            });

            // 存储
            List<String> dataList = new ArrayList<>();
            for(String node : nodeList){
                if(StringUtils.isNotBlank(node)){
                    byte[] nodeData = zooKeeper.getData(ZK_PROVIDER_PATH + "/" + node,false,null);
                    dataList.add(new String(nodeData));
                }
            }

            // 赋值
            rmiServiceUrls = dataList;
        }catch (KeeperException | InterruptedException e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private  <T> T lookupService(String serviceUrl){

        T service = null;
        try{
            service = (T) Naming.lookup(serviceUrl);
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
            if(e instanceof ConnectException){
                if(rmiServiceUrls.size() > 0){
                    serviceUrl = rmiServiceUrls.get(0);
                    lookupService(serviceUrl);
                }
            }
        }
        return service;
    }
}
