package com.mjj.concurrency.readwritelock;

public class BoundedBuffer<V> extends BaseBoundBuffer<V> {

    public BoundedBuffer(int size){
        super(size);
    }

    public synchronized void put(V v) throws InterruptedException{
        while (isFull()){
            // 阻塞生产者
            wait();
        }
        doPut(v);

        // 消费者
        notifyAll();
    }


    public synchronized V take() throws InterruptedException{
        while (isEmpty()){

            // 阻塞消费者
            wait();
        }

        V v = doTake();

        // 唤醒生产者
        notifyAll();
        return v;
    }
}
