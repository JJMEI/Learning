package com.mjj.java_basic.reflect;

public class SuperClass {

    // 静态变量
    private static int staticFiled = 1;

    // 静态常量
    private static final int staticFinalFiled = 2;

    // 实例变量
    private int instanceFiled = 3;

    static {
        System.out.println("this is static code");
    }

    public static void staticMethod(){
        System.out.println("this is a static method");
    }

    public void instanceMethod(){
        System.out.println("This is a instance method");
    }

    private static void privateMethod(){
        System.out.println("this is a private method");
    }

    // 无参构造器
    public SuperClass(){
        System.out.println("this ia super class no arg constructor");
    }

    public SuperClass(int staticFiled, int instanceFiled){
        this.instanceFiled = instanceFiled;
        SuperClass.staticFiled = staticFiled;
    }

    public SuperClass(int instanceFiled){
        this.instanceFiled = instanceFiled;
    }


}
