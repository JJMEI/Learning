package com.mjj.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author meijunjie
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 目标对象 被代理的对象
     */
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     *
     *
     * 动态代理的始终
     * 继承了Proxy类 实现了代理接口   通过InvocationHandler 的invoke方法
     * InvocationHandler 持有了被代理对象
     * @param proxy     生成的代理对象
     * @param method    被代理的方法
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----插入前置代码-----");
        Object rs = null;
        if(method.getName().equals("sayHello")){
            rs = method.invoke(target,args);

        }
        // 执行相应的目标方法

        System.out.println("----插入后置代码-----\"");
        return rs;
    }
}
