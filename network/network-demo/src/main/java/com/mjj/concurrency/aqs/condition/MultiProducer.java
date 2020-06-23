package com.mjj.concurrency.aqs.condition;

public class MultiProducer implements Runnable {

    private ResourceByCondition r;

    public MultiProducer(ResourceByCondition r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true){
            r.product("北京烤鸭");
        }
    }
}
