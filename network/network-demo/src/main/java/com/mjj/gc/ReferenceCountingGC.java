package com.mjj.gc;

/**
 * 引用计数
 */
public class ReferenceCountingGC {


    public Object instance = null;

    private static final int _1MB = 1024*1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) throws InterruptedException {
        ReferenceCountingGC a = new ReferenceCountingGC();
        ReferenceCountingGC b = new ReferenceCountingGC();
        a.instance = b;
        b.instance = a;

        a=null;
        b=null;
        System.gc();
    }
}
