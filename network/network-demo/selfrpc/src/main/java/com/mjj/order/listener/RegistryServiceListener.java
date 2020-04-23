package com.mjj.order.listener;


import com.mjj.rpc.basic.zookeeper.utils.ZKUtil;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.stereotype.Component;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * @author meijunjie
 */
@Component
public class RegistryServiceListener implements SpringApplicationRunListener{

    private static final String SERVICE_ROOT_PATH = "/service_registry";
    ZooKeeper zooKeeper;

    @Value("${server.port}")
    private int port;
    @Override
    public void starting() {
        // 启动时向zookeeper注册当前服务的ip和端口

        zooKeeper = ZKUtil.getZookeeper("localhost:2181",5000);

        if(zooKeeper != null){

            // 注册Zookeeper服务
            try {
                Stat stat = zooKeeper.exists(SERVICE_ROOT_PATH,false);
                if(stat == null){
                    zooKeeper.create(SERVICE_ROOT_PATH,"service registry".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

                    String host = Inet4Address.getLocalHost().getHostAddress();
                    zooKeeper.create(SERVICE_ROOT_PATH + "/order_service", (host+":"+port).getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);

                }
            } catch (KeeperException | InterruptedException | UnknownHostException e) {
                e.printStackTrace();
            }
        }
    }

}
