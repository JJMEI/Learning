package com.mjj.concurrency.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class TimigThreadPool extends ThreadPoolExecutor {

    private final ThreadLocal<Long> startTime = new ThreadLocal<>();

    private final Logger logger = LoggerFactory.getLogger(TimigThreadPool.class);
    private final AtomicLong numTasks = new AtomicLong();
    private final AtomicLong totalTime = new AtomicLong();

    public TimigThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }


    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println("Thread[" + t.getName() + "]:start!");
        startTime.set(System.nanoTime());
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        try{
            long endTime = System.nanoTime();
            long taskTime = endTime - startTime.get();
            numTasks.incrementAndGet();
            totalTime.addAndGet(taskTime);

            System.out.println("Thread["+Thread.currentThread().getName() + "]end!");
        }finally {
            super.afterExecute(r,t);
        }
    }

    @Override
    protected void terminated() {
        try{
            System.out.println("Terminated: avg time=" + totalTime.get()/numTasks.get());
        }finally {
            super.terminated();
        }
    }


    public static void main(String[] args) {
        TimigThreadPool pool = new TimigThreadPool(1,2,1,TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));

        for(int i=0;i<100;i++){
            pool.submit(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        pool.shutdown();
    }
}
