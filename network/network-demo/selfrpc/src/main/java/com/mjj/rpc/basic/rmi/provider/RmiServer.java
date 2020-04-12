package com.mjj.rpc.basic.rmi.provider;

import com.mjj.rpc.basic.rmi.itf.impl.HelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        String url = "rmi://localhost:9090/com.mjj.rpc.basic.rmi.itf.HelloService";

        LocateRegistry.createRegistry(9090);

        // JNDI 发布服务 协议 ip 端口  服务名
        Naming.bind(url,new HelloServiceImpl());
    }
}
