package com.mjj.rpc.basic.rmi.provider;

import com.mjj.rpc.basic.rmi.itf.BasicService;
import org.apache.commons.lang3.StringUtils;
import org.apache.zookeeper.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.concurrent.CountDownLatch;

/**
 *
 * zookeeper 连接层有个简单的封装
 * @author meijunjie
 */
public class ZkServiceProvider implements BasicService {


    private  volatile CountDownLatch countDownLatch;

    public ZkServiceProvider(){
        this.countDownLatch = new CountDownLatch(1);
    }



    public  void publishServiceToZK(Remote remote, String host, int port){
        // 发布本地服务
        String localServiceUrl = publishLocalService(remote, host, port);

        // 连接Zookeeper
        ZooKeeper zooKeeper = connectZKServer();

        // 想zookeeper注册rmi服务地址
        createServiceProviderNode(zooKeeper,localServiceUrl);
    }

    /**
     * 发布本地RMI服务
     * @param remote     服务实现类
     * @param host       注册的host
     * @param port       注册的port
     * @return
     */
    private String publishLocalService(Remote remote, String host, int port){
        String localServiceUrl = null;
        if(remote != null && StringUtils.isNotBlank(host) && port > 1024){
            localServiceUrl = String.format("rmi://%s:%d/%s",host,port,remote.getClass().getName());
            try {
                LocateRegistry.createRegistry(port);
                System.out.println("服务注册地址: " + localServiceUrl);
                Naming.rebind(localServiceUrl,remote);
            } catch (RemoteException | MalformedURLException e) {
                e.printStackTrace();
            }
        }

        return localServiceUrl;
    }

    /**
     * 连接zookeeper
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

    private void createServiceProviderNode(ZooKeeper zooKeeper, String url){
        try{
            byte[] data = url.getBytes();

            /**
             * 创建一个临时有序节点
             */
            zooKeeper.create(ZK_PROVIDER_PATH+"/provider",data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        } catch (InterruptedException | KeeperException e) {
            e.printStackTrace();
        }
    }



}
