package com.mjj.concurrency.threadCommunication;

public class Express {

    public final static String CITY = "ShangHai";

    private int km;
    private String site;

    public Express(){}

    public Express(int km, String site){
        this.km = km;
        this.site = site;
    }

    public synchronized void changeKm(){
        this.km = 101;

        // 唤醒在当前对象上的等待队列
        notifyAll();
    }


    public synchronized void changeSite(){
        this.site = "BeiJing";

        // 随机
        notify();
    }


    public synchronized void waitKm(){
        while (this.km <= 100){
            try{
                System.out.println("check km thread["+ Thread.currentThread().getId()
                +"] is still waiting.");

                wait();

                System.out.println("check km thread["+Thread.currentThread().getId()
                        +"] is notified.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void waitSite(){
        while (CITY.equals(this.site)){
            try{
                System.out.println("check site thread["+ Thread.currentThread().getId()
                        +"] is still waiting.");

                wait();

                System.out.println("check site thread["+Thread.currentThread().getId()
                        +"] is notified.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
