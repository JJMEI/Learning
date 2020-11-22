package com.mjj.concurrency;

public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            // 持有resource1的监视器锁
            synchronized (resource1){
                System.out.println(Thread.currentThread() + " get resource1");
                try{
                    // 休眠 让线程B得到执行
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting get resource2");
                // 持有了resource1 想要获取 resource2 但是resource2被线程2持有 线程在这里被阻塞
                // 线程2 同理 线程2 持有了resource2的监视器锁 接下来想要获取resource1的监视器锁
                synchronized (resource2){
                    System.out.println(Thread.currentThread() + " get resource 2");
                }
            }
        },"线程1").start();


        new Thread(() -> {

            // 线程2持有了resource2的监视器锁
            synchronized (resource1){
                System.out.println(Thread.currentThread() + " get resource2");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting get resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread() + " get resource 2");
                }
            }
        },"线程2").start();



    }
}
