package com.mjj.concurrency.synchronized_;

/**
 * @author meijunjie
 */
public class SynchronizedValidation implements Runnable{
    // 多个实例对象共享
    private  static int i;
    public  static synchronized  void increase(){ i++; }
    public void printValue(){
        System.out.println(i);
    }
    @Override
    public void run() {
        for(int i=0;i<10000;i++){ increase(); } }
    public static void main(String[] args) throws InterruptedException {
        SynchronizedValidation synchronizedValidation = new SynchronizedValidation();
        // t1 和 t2 持有了不同的锁 对同一资源发起竞争访问 而且不可控
        Thread t1 = new Thread(new SynchronizedValidation());
        Thread t2 = new Thread(new SynchronizedValidation());
        t1.start();
        t2.start();
        t1.join();t2.join();

        synchronizedValidation.printValue();
    }
}
