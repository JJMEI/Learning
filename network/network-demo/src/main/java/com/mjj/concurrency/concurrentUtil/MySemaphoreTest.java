package com.mjj.concurrency.concurrentUtil;

import java.util.concurrent.Semaphore;

public class MySemaphoreTest {

    static Semaphore semaphore = new Semaphore(4);

    private static class BusinessThread extends Thread{
        String name="";

        BusinessThread(String name){
            this.name = name;
        }
    }
}
