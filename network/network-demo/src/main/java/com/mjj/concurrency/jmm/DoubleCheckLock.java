package com.mjj.concurrency.jmm;

/**
 * JMM是一组规则，这组规则旨在解决并发编程可能出现的线程安全问题，并提供了内置的解决方案（happens-before原则）以及外部可使用的
 * 同步手段（synchronized lock volatile）确保了程序执行在多线程环境中应有的 原子性  可见性 和 有序性
 */
public class DoubleCheckLock {
    private static volatile DoubleCheckLock instance;
    private DoubleCheckLock(){}

    public static DoubleCheckLock getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLock.class){
                if(instance == null){

                    // 存在线程安全问题
                    // instance = new DoubleCheck();
                    // memory = allocate(); 分配对象空间
                    // instance(memory); 初始化对象
                    // instance = memory; 设置instance指向刚分配的内存地址，此时instance!=null;

                    // 由于指令重排序的问题
                    // memory=allocate(); 分配内存空间
                    // instance = memory; 设置instance指向刚分配的内存地址，此时instance!=null 但是此时对象没有完成初始化
                    // instance(memory); 初始化对象，当instance不为null时，由于instance实例为初始化完成也就造成了线程安全的问题
                    // volatile  关键字禁止指令重排序
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        for(;;){
            new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(DoubleCheckLock.getInstance());
            }).start();
        }
    }
}
