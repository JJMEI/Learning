package com.mjj.spring.cap1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        // 基于xml配置
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");

        // 从容器中获取bean
        System.out.println(context.getBean("person"));


    }
}
