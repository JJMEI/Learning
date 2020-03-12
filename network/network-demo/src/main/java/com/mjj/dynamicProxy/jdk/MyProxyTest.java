package com.mjj.dynamicProxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class MyProxyTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");


        // 获取动态代理类

        Class proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(),IHello.class);

        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);


        IHello iHello = (IHello) constructor.newInstance(new MyInvocationHandler(new HelloImpl()));

        iHello.sayHello();




        IHello hello_ = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),new Class[]{IHello.class},new MyInvocationHandler(new HelloImpl()));

        hello_.sayHello();
    }
}
