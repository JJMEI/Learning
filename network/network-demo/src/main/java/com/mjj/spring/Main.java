//package com.mjj.spring;
//
//import redis.clients.jedis.Jedis;
//
//import java.time.LocalTime;
//import java.util.UUID;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//
//
//public class Main {
//
//    public static void main(String[] args) throws InterruptedException {
//        ExecutorService service = Executors.newFixedThreadPool(8);
//
//        //
//        Jedis jedis = new Jedis("127.0.0.1",6379);
//
//        CountDownLatch countDownLatch = new CountDownLatch(11);
//        for (int i = 0; i < 700; i++) {
//            service.execute(() -> {
//
//                JedisUtil jedisUtil = new JedisUtil();
//                String lockValue = String.valueOf(UUID.randomUUID());
//                if (jedisUtil.acquireLockBlock("LEGOU", "CREATE_ORDER", lockValue,20000,jedis)) {
//                    try {
//                        // 模拟业务代码
//
//                        System.out.println(lockValue + " 持有分布式锁 " + LocalTime.now().toString());
//                        Thread.sleep(5000);
//                    } catch (Exception e) {
//
//                    } finally {
//                        jedisUtil.releaseLock("LEGOU", "CREATE_ORDER",lockValue,jedis);
//                        System.out.println(lockValue + " 释放分布式锁 " + LocalTime.now().toString());
//
//                    }
//                }
//            });
//        }
//
//        countDownLatch.await();
//    }
//}
