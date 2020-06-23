package com.mjj.concurrency.aqs.condition;

public class MultiConsumer implements Runnable {
    private ResourceByCondition r;

    public MultiConsumer(ResourceByCondition r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true){
            r.consume();
        }
    }
}
