package com.mjj.concurrency.aqs.condition;

public class Test {
    public static void main(String[] args) {
        ResourceByCondition r = new ResourceByCondition();

        MultiConsumer multiConsumer = new MultiConsumer(r);
        MultiProducer multiProducer = new MultiProducer(r);

        Thread t0 = new Thread(multiProducer);
        Thread t1 = new Thread(multiProducer);

        Thread t2 = new Thread(multiConsumer);

        t0.start();t1.start();t2.start();
    }
}
