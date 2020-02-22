package com.mjj.concurrency.atomOperation;

import java.util.concurrent.atomic.AtomicStampedReference;


/**
 * 处理ABA问题
 * AtomicMarkableReference     版本号是布尔型   关心这个值有没有动过
 * AtomicStampedReference      版本号是时间
 */
public class UseAtomicStampedRefrence {


    static AtomicStampedReference<String> atomicStampedReference =
            new AtomicStampedReference<>("Mark",0);


    public static void main(String[] args) throws InterruptedException {

        // 获取初始版本号
        final int oldStamp = atomicStampedReference.getStamp();

        final String oldReference = atomicStampedReference.getReference();

        System.out.println(oldReference + "----" + oldStamp);

        Thread rightStampThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                +" 当前变量值 " + oldReference + " 当前版本cuo " + oldStamp
                +atomicStampedReference.compareAndSet(oldReference+"1",oldReference+"java",0,oldStamp+1));
            }
        });

        rightStampThread.start();
        // 等待当前线程执行
        rightStampThread.join();
    }
}
