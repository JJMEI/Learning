package com.mjj.spring.cap5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    @org.junit.Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Cap5Config.class);


        System.out.println(context.getBean("person"));
    }
}
