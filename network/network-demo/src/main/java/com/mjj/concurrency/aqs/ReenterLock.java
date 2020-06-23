package com.mjj.concurrency.aqs;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable {
    private static ReentrantLock lock = new ReentrantLock();
    public int i = 0;

    @Override
    public void run() {
        for(int j=0;j<1000000;j++){
            lock.lock();

            // 支持锁重入
            lock.lock();

            try{
                i++;
            }finally {

                // 执行两次加锁
                lock.unlock();
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ReenterLock lock = new ReenterLock();

        Thread t1 = new Thread(lock);
        Thread t2 = new Thread(lock);

        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(lock.i);
    }
}
