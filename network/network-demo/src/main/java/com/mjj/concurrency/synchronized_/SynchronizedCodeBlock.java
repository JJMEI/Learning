package com.mjj.concurrency.synchronized_;

public class SynchronizedCodeBlock {

    private int i;
    public void increase(){
        synchronized (SynchronizedCodeBlock.class){
            i++;
        }
    }
}
