package com.mjj.concurrency.executor;

import java.math.BigInteger;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BrokePrimeProducer extends Thread {

    private final BlockingQueue<BigInteger> queue;
    private volatile boolean cancelled = false;

    BrokePrimeProducer(BlockingQueue<BigInteger> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try{
            BigInteger p = BigInteger.ONE;
            while (!cancelled){
                queue.put(p = p.nextProbablePrime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancel(){
        cancelled = true;
    }


    void consumePrimes(){
        BlockingQueue<BigInteger> primes = new ArrayBlockingQueue<BigInteger>(4);
        BrokePrimeProducer primeProducer = new BrokePrimeProducer(primes);
        primeProducer.start();
    }
}
