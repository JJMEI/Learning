package com.mjj.java_basic.class_obj;

class Candy{

    /**
     * 静态字段
     */
    private static String STATIC_PROPERTY;

    /**
     * 静态常量
     */
    private final static String FINAL_STATIC_PROPERTY = "FINAL_STATIC_PROPERTY";

    /**
     * 静态方法
     */
    public static void staticMethod(){
        System.out.println("invoke static method");
    }

    /**
     * 静态代码块
     */
    static {
        System.out.println("Loading Candy");
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}


public class SweetShop {

    public static void print(Object o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        print("inside main");

        new Candy();

        Candy.staticMethod();

//        print("after creating Candy");
//
//        try{
//            Class.forName("com.mjj.java_basic.class_obj.Gum");
//        } catch (ClassNotFoundException e) {
//            print("can not find gum");
//        }
//
//        print("after class.forName()");
//
//        new Cookie();
//
//        print("after creating cookie");
    }
}
