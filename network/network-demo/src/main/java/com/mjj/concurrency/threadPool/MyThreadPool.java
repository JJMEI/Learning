package com.mjj.concurrency.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyThreadPool {

    /**
     * 默认核心线程池大小
     */
    private static int DEFAULT_WORK_NUM = 5;

    private static int DEFAULT_TASK_NUM = 100;


    /**
     * 工作线程组
     */
    private WorkThread[] workThreads;

    /**
     * 任务队列
     */
    private final BlockingQueue<Runnable> taskQueue;


    /**
     * 用户设定的工作线程数
     */
    private final int workNum;


    public MyThreadPool(){
        this(DEFAULT_WORK_NUM,DEFAULT_TASK_NUM);
    }

    public MyThreadPool(int workNum, int taskCount){

        // check 传入的值
        if(workNum < 0){
            workNum = DEFAULT_WORK_NUM;
        }

        if(taskCount < 0){
            taskCount = DEFAULT_TASK_NUM;
        }

        this.workNum = workNum;
        this.taskQueue = new ArrayBlockingQueue<>(taskCount);

        // 启动工作线程
        workThreads = new WorkThread[workNum];

        for(int i=0;i<workNum;i++){
            workThreads[i] = new WorkThread();

            // 启动工作线程
            workThreads[i].start();
        }
    }


    public void execute(Runnable task){
        try{
            taskQueue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void destory(){
        System.out.println("准备关闭线程池");

        // 清空线程
        taskQueue.clear();
    }









    private class WorkThread extends Thread{


        @Override
        public void run() {
            Runnable r = null;
            try{
                r = taskQueue.take();
                while (!this.isInterrupted()){
                    r.run(); // 同步执行
                }
                //
                r = null;
            }catch (Exception e){

            }
        }
    }
}
