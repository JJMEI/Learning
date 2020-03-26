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
 *
 * 在Java中，关于单例要记住的是线程安全
 * 延迟加载  序列化与反序列化安全  反射安全
 *
 * 无法使用反射创建枚举实例
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
