package com.mjj.concurrency.concurrentUtil;

import java.util.concurrent.CountDownLatch;

public class UseCountDownLatch {


    /**
     * 6个栓
     */
    static CountDownLatch latch = new CountDownLatch(6);
}
