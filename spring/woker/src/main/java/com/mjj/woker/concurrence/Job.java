package com.mjj.woker.concurrence;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author meijunjie
 */
public class Job implements Runnable {
    private CountDownLatch countDownLatch;

    public Job() {
    }

    public Job(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try{
            // do something
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(countDownLatch != null){
                countDownLatch.countDown();
                System.out.println("线程: " + Thread.currentThread().getName() + " 任务执行完毕");
            }
        }
    }
}
