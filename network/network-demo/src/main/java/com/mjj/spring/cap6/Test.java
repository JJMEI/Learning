package com.mjj.spring.cap6;

import com.mjj.spring.cap6.config.Cap6Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Cap6Config.class);


        String[] names = context.getBeanDefinitionNames();

        for(String name : names){
            System.out.println(name);
        }
    }
}
