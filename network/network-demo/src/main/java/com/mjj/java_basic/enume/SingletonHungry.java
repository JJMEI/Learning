package com.mjj.java_basic.enume;

/**
 * 基于classloader机制避免了多线程安全的问题
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry(){

    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
