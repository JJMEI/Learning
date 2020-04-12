package com.mjj.rpc.basic.rmi.consumer;

import com.mjj.rpc.basic.rmi.itf.HelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author meijunjie
 */
public class RmiConsumer {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        HelloService helloService = (HelloService) Naming.lookup("rmi://localhost:9090/com.mjj.rpc.basic.rmi.itf.HelloService");

        if(helloService != null){
            System.out.println(helloService.hello("LYL"));
        }
    }
}
