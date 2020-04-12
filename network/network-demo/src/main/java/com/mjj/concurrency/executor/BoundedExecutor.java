package com.mjj.concurrency.executor;

import io.netty.util.concurrent.DefaultThreadFactory;

import java.util.concurrent.*;

public class BoundedExecutor {

    private final ExecutorService executorService;
    private final Semaphore semaphore;

    public BoundedExecutor(ExecutorService executorService, Semaphore semaphore) {
        this.executorService = executorService;
        this.semaphore = semaphore;
    }

    public void submitTask(final Runnable command) throws InterruptedException {
        semaphore.acquire();
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try{
                        command.run();
                    }finally {
                        semaphore.release();
                    }
                }
            });
        }catch (RejectedExecutionException e){
            semaphore.release();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4,2,TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        poolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("当前任务丢弃");
            }
        });
        BoundedExecutor boundedExecutor = new BoundedExecutor(poolExecutor,new Semaphore(2));

        for(;;){
            boundedExecutor.submitTask(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("任务提交");
                }
            });
        }
    }
}
