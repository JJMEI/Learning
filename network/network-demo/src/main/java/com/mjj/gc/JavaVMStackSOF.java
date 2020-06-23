package com.mjj.gc;

public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){

        stackLength++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch (Exception e){
            System.out.println("stack length: " + oom.stackLength);
            throw e;
        }
    }

}
