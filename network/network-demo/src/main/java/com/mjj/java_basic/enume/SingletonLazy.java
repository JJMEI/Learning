package com.mjj.java_basic.enume;

public class SingletonLazy {
    private static volatile SingletonLazy instance = null;

    private SingletonLazy(){}

    /**
     * synchronized关键字保证了线程安全，重量级锁影响线程安全
     * @return
     */
    public static synchronized SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
