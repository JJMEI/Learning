package com.mjj.java_basic.class_obj.passive_reference.example3;

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.COMPLIED_CONST_VALUE);

        System.out.println(ConstClass.NOT_COMPLIED_CONST_VALUE);
    }
}
