package com.mjj.concurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    /**
     * 可重入锁
     * 显示锁必须显示是释放
     * 使用锁的标志范式
     */
    private Lock lock = new ReentrantLock();

    private int count;

    public void increment(){
        lock.lock();
        try{
            count++;
        }finally {
            lock.unlock();
        }
    }

    public synchronized  void increment2(){
        count++;

        // 同一个线程 锁的可重入，synchronized的锁是隐式自动释放
        increment2();
    }
}
