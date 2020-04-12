package com.mjj.rpc.simple.server;

import com.mjj.rpc.simple.server.itf.IOrderService;
import com.mjj.rpc.simple.server.itf.impl.OrderServiceImpl;
import com.mjj.rpc.simple.server.registry.RegistryCenter;

import java.io.IOException;

/**
 * @author meijunjie
 */
public class RpcServer {

    public static void main(String[] args) {
        new Thread(() -> {
            // 1. 创建注册中心
            RegistryCenter registryCenter = new RegistryCenter(9999);
            registryCenter.registry(IOrderService.class, OrderServiceImpl.class);
            try {
                registryCenter.start();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("服务端启动失败！异常信息" + e);
            }
            // 2. 注册当前服务
            // 3. 启动服务
        }).start();
    }
}
