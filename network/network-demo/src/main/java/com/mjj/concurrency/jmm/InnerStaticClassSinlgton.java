package com.mjj.concurrency.jmm;

public class InnerStaticClassSinlgton {


    private InnerStaticClassSinlgton() {
    }

    /**
     * 利用类加载机制保证线程安全
     */
    private static class SingltonHolder{
        static InnerStaticClassSinlgton instance = new InnerStaticClassSinlgton();
    }

    public static InnerStaticClassSinlgton getInstance(){
        return SingltonHolder.instance;
    }
}
