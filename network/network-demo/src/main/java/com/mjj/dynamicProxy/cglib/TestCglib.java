package com.mjj.dynamicProxy.cglib;


import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(CglibService.class);

        enhancer.setCallback(new TargetMethodInterceptor());

        CglibService targetObject = (CglibService) enhancer.create();

        System.out.println(targetObject.sayHello("DDDDDD"));

        // final方法不能由
        System.out.println(targetObject.sayOthers(333));
    }
}
