package com.mjj.java_basic.class_obj.passive_reference.example3;

import java.util.Random;

public class ConstClass {

    /**
     * 编译期静态常量
     */
    public static final int COMPLIED_CONST_VALUE = 1;

    /**
     * 非编译期静态常量
     */
    public static final long NOT_COMPLIED_CONST_VALUE = System.currentTimeMillis();



    static {
        System.out.println("ConstClass init!");
    }

}


