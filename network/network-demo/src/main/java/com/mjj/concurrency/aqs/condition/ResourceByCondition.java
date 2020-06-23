package com.mjj.concurrency.aqs.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceByCondition {

    private String name;
    private int count = 1;
    private boolean flag = false;

    Lock lock = new ReentrantLock();

    Condition producerCon = lock.newCondition();
    Condition consumerCon = lock.newCondition();

    public void product(String name){
        lock.lock();
        try{
            while (flag){
                try{
                    // 有烤鸭了  生产者要进行等待
                    producerCon.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "  生产者5.0 " + this.name);

            // 有烤鸭了
            flag = true;

            // 唤醒消费线程 进行消费
            consumerCon.signal();

        }finally {
            // 释放锁
            lock.unlock();
        }
    }


    public void consume(){
        lock.lock();
        try{
            while (!flag){
                try{
                    // 没有烤鸭了 消费者要进行等待
                    consumerCon.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "  消费5.0  " + this.name);
            // 烤鸭被消耗完了 要唤醒生产者生产
            flag = false;
            // 唤醒生产者
            producerCon.signal();
        }finally {
            lock.unlock();
        }
    }

}

