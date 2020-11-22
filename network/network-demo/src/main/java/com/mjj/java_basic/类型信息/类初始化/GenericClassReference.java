package com.mjj.java_basic.类型信息.类初始化;

/**
 * @author meijunjie
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericClass = int.class;
        genericClass = Integer.class;
        intClass = double.class;
        // Error:(12, 30) java: 不兼容的类型: java.lang.Class<java.lang.Double>无法转换为java.lang.Class<java.lang.Integer>
//        genericClass = double.class;

    }
}
