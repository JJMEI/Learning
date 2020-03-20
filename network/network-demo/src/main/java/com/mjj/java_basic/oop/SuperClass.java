package com.mjj.java_basic.oop;

/**
 * 继承是Java面向对象的基础
 *
 * 父类 与子类直接的关系是 is a  父类更通用  子类更具体
 * 父类
 * @author meijunjie
 */
public class SuperClass {

    /**
     * 静态变量
     */
    private static String propertyA;

    /**
     * 静态常量
     */
    private static final String PROPERTY_B = "PROPERTY_B";

    /**
     * 成员变量
     */
    private String propertyC;


    static {

        System.out.println("this is super class's static code....");
    }


    public static void staticMethod(){
        System.out.println("Invoke static method staticMethod()...");
    }

    public SuperClass(){
        System.out.println("this is a no arg constructor...");
    }



    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        System.out.println(SuperClass.class.newInstance());
    }
}
