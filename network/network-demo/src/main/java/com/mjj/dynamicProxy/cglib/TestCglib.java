package com.mjj.dynamicProxy.cglib;


import org.springframework.cglib.proxy.Enhancer;

public class TestCglib {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TargetObject.class);

        enhancer.setCallback(new TargetMethodInterceptor());

        TargetObject targetObject = (TargetObject) enhancer.create();

        System.out.println(targetObject.method1("DDDDDD"));
        System.out.println(targetObject.method2(333));
    }
}
