package com.mjj.concurrency.stopThread;

public class HasInterruptException {

    private static class UseThread extends Thread{
        public UseThread(String name){
            super(name);
        }

        @Override
        public void run(){
            String threadName = Thread.currentThread().getName();
            while (!this.isInterrupted()){
                try{
                    System.out.println(threadName + " is running");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // 捕获到中断异常，中断标志位被重置
                    System.out.println(threadName + " catch interrupt flag is " + isInterrupted());
                    interrupt();
                    e.printStackTrace();

                }
            }

            // 输出线程的中断状态
            System.out.println(threadName + " interrupt flag is " + isInterrupted());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread endThread = new UseThread("exampleThread");
        endThread.start();

        System.out.println("main thread sleep 800ms");

        Thread.sleep(800);
        System.out.println("main begin interrupt thread!");
        // 在休眠的时候被中断，会抛出异常InterruptedException
        endThread.interrupt();
    }
}
