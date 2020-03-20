package com.mjj.concurrency.synchronized_;

/**
 * @author meijunjie
 */
public class SynchronizedValidation {


    public int i;

    public void syncTask(){
        //同步代码库
        synchronized (this){
            i++;
        }
    }


    public synchronized void syncTask(int arg){
        System.out.println(arg);
    }

}
