package com.mjj.dynamicProxy.jdk;

/**
 * 接口实现类
 * 被代理的类
 */

public class HelloImpl implements IHello {
    @Override
    public void sayHello() {
        System.out.println("i am dynamic say Hello");
    }
}
