package com.mjj.concurrency.startThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new UseExtendsThread().start();

        new Thread(new UseImplRunnable()).start();


        // FutureTask 实现了Runnable  用于获取线程的执行结果
        FutureTask<String> futureTask = new FutureTask<>(new UseImplCallable());

        new Thread(futureTask).start();

        System.out.println(futureTask.get());
    }
}
