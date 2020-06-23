package com.mjj.concurrency.atomOperation;

import java.util.concurrent.atomic.AtomicReference;

public class SpinLock {

    private AtomicReference<Thread> sign = new AtomicReference<>();

    public void lock(){
        Thread current = Thread.currentThread();
        while (!sign.compareAndSet(null,current)){
//            System.out.println("自旋中...." + current.getName());
        }
    }

    public void unlock(){
        Thread current = Thread.currentThread();

        sign.compareAndSet(current,null);
        System.out.println(current.getName() + " 释放锁完毕");
    }

    public static void main(String[] args) {

        SpinLock lock = new SpinLock();
        for(int i=0;i<10;i++){
            new Thread(new Worker(lock)).start();
        }
    }

    static class Worker implements Runnable{

        private SpinLock lock;

        public Worker(SpinLock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();

            try{
                // 模拟操作耗时
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

}
