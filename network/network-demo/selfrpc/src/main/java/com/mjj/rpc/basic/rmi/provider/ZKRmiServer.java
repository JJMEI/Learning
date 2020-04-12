package com.mjj.rpc.basic.rmi.provider;

import com.mjj.rpc.basic.rmi.itf.impl.HelloServiceImpl;

import java.rmi.RemoteException;

public class ZKRmiServer {

    public static void main(String[] args) throws RemoteException {
        ZkServiceProvider zkServiceProvider = new ZkServiceProvider();

        zkServiceProvider.publishServiceToZK(new HelloServiceImpl(),"localhost",8888);
    }
}
