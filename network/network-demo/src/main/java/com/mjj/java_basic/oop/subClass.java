package com.mjj.java_basic.oop;

/**
 * @author meijunjie
 */
public class subClass extends SuperClass {

    static {
        System.out.println("this is a sub class's static code");
    }


    public static void main(String[] args) {
        System.out.println(subClass.class);
    }
}
