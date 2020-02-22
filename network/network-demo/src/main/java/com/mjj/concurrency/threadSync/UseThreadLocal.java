package com.mjj.concurrency.threadSync;

public class UseThreadLocal {

    static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 10;
        }
    };



    public void startThreadArray(){
        Thread[] runs = new Thread[3];
        for(int i=0;i<runs.length;i++){
            runs[i] = new Thread(new TestThread(i));
        }

        for(int i=0;i<runs.length;i++){
            runs[i].start();
        }

    }


    public static class TestThread implements Runnable{
        int id;
        public TestThread(int id){
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":start");
            // 获取变量的值
            Integer s = threadLocal.get();

            s = s + id;

            threadLocal.set(s);
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
        }
    }


    public static void main(String[] args) {
        UseThreadLocal useThreadLocal = new UseThreadLocal();

        useThreadLocal.startThreadArray();
    }
}
