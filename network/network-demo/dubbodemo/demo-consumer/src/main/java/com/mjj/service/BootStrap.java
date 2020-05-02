package com.mjj.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();

        HelloDubboService helloDubboService = context.getBean(HelloDubboService.class);

        System.out.println(helloDubboService.sayHelloDubbo());

    }
}
