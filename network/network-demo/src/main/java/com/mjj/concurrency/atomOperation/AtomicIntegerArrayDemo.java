package com.mjj.concurrency.atomOperation;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        // 只是针对它被包围的
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(arr);


        System.out.println("获取当前索引的值:" + atomicIntegerArray.getAndDecrement(0));
        System.out.println("获取当前索引的值:" + atomicIntegerArray.getAndDecrement(0));


        System.out.println(atomicIntegerArray.compareAndSet(0,-1,22));


        System.out.println(arr[0]);
    }
}
