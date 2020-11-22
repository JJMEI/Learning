package com.mjj.java_basic.类型信息.类初始化;

public class Initable {
    static final int staicFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("initializing Initable");
    }
}
