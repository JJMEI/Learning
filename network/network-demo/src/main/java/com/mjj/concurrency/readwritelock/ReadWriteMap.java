package com.mjj.concurrency.readwritelock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author meijunjie
 *
 *
 * 显示的Lock与内部锁相比提供了一些扩展的特性
 *  包括处理不可用的锁时更好的灵活性，已经队列行为的更好控制
 *  ReentrantLock不能完全替代synchronized;
 *  只有当你需要synchronized没有提供的特性时才应该使用
 *
 *
 */
public class ReadWriteMap<K,V> {

    private final Map<K,V> map;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock r = lock.readLock();
    private final Lock w = lock.writeLock();


    public ReadWriteMap(Map<K, V> map) {
        this.map = map;
    }


    public V put(K key, V value){
        w.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " 获取到写锁...");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            return map.put(key, value);
        }finally {
            w.unlock();
        }
    }

    public V get(K key){

        r.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " 获取到读锁...");
            return map.get(key);
        }finally {
            r.unlock();
        }
    }


    public static void main(String[] args) {
        ReadWriteMap<String,String> readWriteMap = new ReadWriteMap<>(new HashMap<>(4));

//        new Thread(() -> readWriteMap.put("1","1")).start();
//        new Thread(() -> readWriteMap.put("2","2")).start();
        for(;;)
         new Thread(() -> System.out.println(readWriteMap.get("1"))).start();

    }
}
