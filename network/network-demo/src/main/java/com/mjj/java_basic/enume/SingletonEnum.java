package com.mjj.java_basic.enume;

/**
 * 枚举单例
 *
 * 线程安全
 * 反射安全
 * 序列化安全
 *
 * 直接使用SingletonEnum.INSTANCE进行访问
 * 枚举序列化是由JVM保证的，每一个枚举类型和定义的枚举变量在JVM中都是唯一的
 */
public enum SingletonEnum {
    INSTANCE;

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
