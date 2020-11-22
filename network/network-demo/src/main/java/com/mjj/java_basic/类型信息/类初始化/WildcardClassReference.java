package com.mjj.java_basic.类型信息.类初始化;

public class WildcardClassReference {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;

        // 原始类型
        System.out.println(int.class.getTypeName());
        // 包装类型
        System.out.println(Integer.class.getTypeName());

        // 数组类型
        System.out.println(Integer[].class.getTypeName());
    }
}
