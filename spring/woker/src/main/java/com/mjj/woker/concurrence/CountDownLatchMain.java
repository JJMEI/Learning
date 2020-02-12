package com.mjj.woker.concurrence;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(8);


//        System.out.println("子任务开始处理...");
        for(int i=0;i<8;i++){
            new Thread(new Job(countDownLatch)).start();
        }

        // 等待 当countDownLatch == 0
        countDownLatch.await();
        System.out.println("所有任务执行完毕...");
    }
}
