package com.mjj.java_basic.reflect;

public class SubClass extends SuperClass {

    // 静态变量
    private static int staticFiledSub = 1;

    // 静态常量
    private static final int staticFinalFiledSub = 2;

    // 实例变量
    private int instanceFiledSub = 3;

    static {
        System.out.println("this is static code");
    }

    public static void staticMethodSub(){
        System.out.println("this is a static method");
    }

    public void instanceMethodSub(){
        System.out.println("This is a instance method");
    }

    private static void privateMethodSub(){
        System.out.println("this is a private method");
    }

    // 无参构造器
    public SubClass(){
        System.out.println("this ia super class no arg constructor");
    }

    public SubClass(int staticFiledSub, int instanceFiledSub){
        this.instanceFiledSub = instanceFiledSub;
        SubClass.staticFiledSub = staticFiledSub;
    }

    public SubClass(int instanceFiledSub){
        this.instanceFiledSub = instanceFiledSub;
    }


    private SubClass(Integer staticFiledSub){
        SubClass.staticFiledSub = staticFiledSub;
    }
}
