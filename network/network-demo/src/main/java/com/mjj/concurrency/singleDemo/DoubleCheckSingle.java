package com.mjj.concurrency.singleDemo;

public class DoubleCheckSingle {

    private static DoubleCheckSingle doubleCheckSingle;

    private DoubleCheckSingle(){
        System.out.println(Thread.currentThread().getName() + " 改线成完成了初始化 over");
    }


    public static DoubleCheckSingle getInstance(){
        if(doubleCheckSingle == null){
            synchronized (DoubleCheckSingle.class){
                if(doubleCheckSingle == null){
                    doubleCheckSingle = new DoubleCheckSingle();
                }
            }
        }
        return doubleCheckSingle;
    }


    public static void main(String[] args) {

        new Thread(() -> DoubleCheckSingle.getInstance()).start();

        new Thread(() -> DoubleCheckSingle.getInstance()).start();


    }
}
