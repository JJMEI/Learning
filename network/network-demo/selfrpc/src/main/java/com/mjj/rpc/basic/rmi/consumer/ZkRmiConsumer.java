package com.mjj.rpc.basic.rmi.consumer;

import com.mjj.rpc.basic.rmi.itf.HelloService;

import java.rmi.RemoteException;

public class ZkRmiConsumer {

    public static void main(String[] args) throws RemoteException {
        ZkServiceConsumer consumer = new ZkServiceConsumer();

        HelloService helloService = consumer.lookup();
        System.out.println(helloService.hello("LYL"));


    }
}
