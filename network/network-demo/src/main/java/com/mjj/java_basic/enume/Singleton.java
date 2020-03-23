package com.mjj.java_basic.enume;

public class Singleton {

    /**
     *  1 可见性
     *  2 禁止指令重排序
     *  JDk1.5 之后才是安全的
     */
    private static volatile Singleton instance = null;

    private Singleton(){

    }

    /**
     * 双重检查锁
     * @return
     */
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
