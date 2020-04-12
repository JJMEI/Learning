package com.mjj.rpc.basic.rmi.itf.impl;

import com.mjj.rpc.basic.rmi.itf.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * 所有的接口实现类必须继承UnicastRemoteObject，必须实现无参构造方法并抛出RemoteException
 * @author meijunjie
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    public HelloServiceImpl() throws RemoteException {
    }

    @Override
    public String hello(String context) throws RemoteException {
        return "I say " + context;
    }
}
