package com.mjj.rpc.basic.rmi.itf;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * Remote 一个标记接口，所有要使用的RMI服务的接口 必须继承至 Remote,而且方法必须抛出RemoteException异常
 */
public interface HelloService extends Remote {

    String hello(String context) throws RemoteException;
}
