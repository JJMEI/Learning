package com.mjj.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        System.out.println("dubbo provider start...");
        try{
            System.in.read();
            // 输入任意字符
        }catch (Exception e){

        }
    }
}
