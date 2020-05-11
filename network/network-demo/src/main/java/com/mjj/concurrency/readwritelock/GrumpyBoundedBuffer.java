package com.mjj.concurrency.readwritelock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GrumpyBoundedBuffer<V> extends BaseBoundBuffer<V> {

    public GrumpyBoundedBuffer(int size){
        super(size);
    }

    public synchronized void put(V v){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        doPut(v);
    }

    public synchronized V take() {
        if(isEmpty()){
            System.out.println("队列已空");
            return null;
        }
        return doTake();
    }

    public static void main(String[] args) {
        GrumpyBoundedBuffer<String> grumpyBoundedBuffer = new GrumpyBoundedBuffer<>(5);

        ExecutorService producer = Executors.newFixedThreadPool(1);
        ExecutorService consumer = Executors.newFixedThreadPool(2);

        new Thread(() -> {
            for(;;){
                producer.submit(() -> grumpyBoundedBuffer.put(Thread.currentThread().getName()));
            }
        }).start();

        new Thread(() -> {
            for(;;){
                consumer.submit(() -> {

                    System.out.println(grumpyBoundedBuffer.take());
                });
            }
        }).start();
    }
}
