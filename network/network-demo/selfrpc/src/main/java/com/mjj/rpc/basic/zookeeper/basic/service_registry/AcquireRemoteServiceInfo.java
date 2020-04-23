package com.mjj.rpc.basic.zookeeper.basic.service_registry;

import com.mjj.rpc.basic.zookeeper.utils.ZKUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class AcquireRemoteServiceInfo {
    private static final String SERVICE_ROOT_REGISTRY = "/service_registry";
    private static final String SERVICE_NODE_NAME = "/order_service";

    private ZooKeeper zooKeeper;

    public AcquireRemoteServiceInfo() throws IOException, KeeperException, InterruptedException {
        this.zooKeeper = new ZooKeeper("localhost:2181", 5000, event -> {
            if(event.getType() == Watcher.Event.EventType.NodeChildrenChanged){
                System.out.println("子节点发生变化..." + event.getType().name());
                try {
                    updateServiceServerList();
                } catch (KeeperException | InterruptedException | UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });

        updateServiceServerList();

    }

    public  void acquireRemoteServiceInfo(){

        try {
            if(zooKeeper != null){
                List<String> childServiceNode = zooKeeper.getChildren(SERVICE_ROOT_REGISTRY, event -> {

                    // 当前父节点下子节点发生了变GG
                    if(event.getType() == Watcher.Event.EventType.NodeChildrenChanged){
                        try {
                            System.out.println("子节点发生变化..." + event.getType().name());
                            updateServiceServerList();
                        } catch (KeeperException | InterruptedException | UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                });

                updateServiceServerList();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private  void updateServiceServerList() throws KeeperException, InterruptedException, UnsupportedEncodingException {
        List<String> childServiceNode = zooKeeper.getChildren(SERVICE_ROOT_REGISTRY,true);

        List<String> newServerList = new ArrayList<>();

        if(childServiceNode != null && childServiceNode.size() > 0){
            for(String child : childServiceNode){
                if(StringUtils.isNotBlank(child)){
                    byte[] nodeData = zooKeeper.getData(SERVICE_ROOT_REGISTRY + "/" + child,false,null);
                    newServerList.add(new String(nodeData,"UTF-8"));
                }
            }

            LoadBlance.serviceServerList = newServerList;
        }

    }
}
