package com.mjj.java_basic.类型信息.类初始化;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);


    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println(" After create Initable ref...");

        // 对静态常量引用 不会触发类的初始化 编译期就可以确定变量的值
        System.out.println(Initable.staicFinal);

        // 编译期不可确定的静态常量 则会触发类的初始化
        System.out.println(Initable.staticFinal2);

        // 引用静态变量 会触发类的初始化
        System.out.println(Initable2.staticNonFinal);

        // Class.forName()会 触发类的初始化
        Class initable3 = Class.forName("com.mjj.java_basic.类型信息.类初始化.Initable3");
        System.out.println(" after crating initable3 ref...");
        // 引用静态变量 但是不会再触发初始化
        System.out.println(Initable3.staticNonFinal);


    }
}
