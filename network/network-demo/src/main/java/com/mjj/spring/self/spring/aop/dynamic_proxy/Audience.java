package com.mjj.spring.self.spring.aop.dynamic_proxy;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void takeSeats(){
        System.out.println(" The audience is taking their seats.");
    }

    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud(){
        System.out.println("CLAP  CLAP  CLAP CLAP...");
    }

    public void demandRefund(){
        System.out.println("Boo! we want our money back!");
    }

    public void watchPlayer(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("The audience is taking their seats...");
            System.out.println("The audience is turning off their cellphones...");

            long start = System.nanoTime();
            joinPoint.proceed();
            joinPoint.proceed();
            joinPoint.proceed();
            long end = System.nanoTime();
            System.out.println("The audience applaud...");
            System.out.println("The play took " + (end-start) + " nano");
        }catch (Throwable t){
            System.out.println("boo! we want our money back!");
        }
    }
}
