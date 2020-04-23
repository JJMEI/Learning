package com.example.orderservice.listener;

import com.example.orderservice.utils.ZKUtil;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * @author meijunjie
 */
public class RegistryServiceListener implements ServletContextListener {

    private static final String SERVICE_ROOT_REGISTRY = "/service_registry";
    private static final String SERVICE_NODE_NAME = "/order_service";



    @Value("${server.port}")
    private int port;
    /**
     * 上下文初始化的是 完成服务的组成
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext()).getAutowireCapableBeanFactory().autowireBean(this);
        ZooKeeper zooKeeper = ZKUtil.getZookeeper("localhost:2181",5000);

        if(zooKeeper != null) try {
            Stat stat = zooKeeper.exists(SERVICE_ROOT_REGISTRY, false);
            if (stat == null) {
                zooKeeper.create(SERVICE_ROOT_REGISTRY, "service registry".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
            String host = Inet4Address.getLocalHost().getHostAddress();

            zooKeeper.create(SERVICE_ROOT_REGISTRY+SERVICE_NODE_NAME, (host+":"+port).getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL_SEQUENTIAL);
        } catch (KeeperException | InterruptedException | UnknownHostException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        else {
            throw new IllegalArgumentException("registry order service error!");
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
