package com.mjj.concurrency.atomOperation;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        /**
         * 期待的值是5说明当前内存位置上取的是最新的值
         */
        System.out.println("期待的值是:" + atomicInteger);

        atomicInteger.set(11);

        System.out.println(atomicInteger.get());
        System.out.println("atomicInteger.compareAndSet(5,2019) = " + atomicInteger.compareAndSet(5, 2019));

        System.out.println(atomicInteger.addAndGet(44));

        System.out.println(atomicInteger.getAndDecrement());

        // 交换之后的新值

        System.out.println("交换后的新值是:" + atomicInteger.get());
        System.out.println("atomicInteger.compareAndSet(5,1024) = " + atomicInteger.compareAndSet(5, 1024));



        AtomicInteger ai = new AtomicInteger(10);

        // 返回原值 10   ---> 新值变成了 11
        System.out.println(ai.getAndIncrement());

        // 11--->12  再返回
        System.out.println(ai.incrementAndGet());

        System.out.println(ai.get());

    }
}
