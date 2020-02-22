package com.mjj.spring.cap1.config;

import com.mjj.spring.cap1.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        try{
            System.out.println(context.getBean("person"));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(context.getBean("personByAnnotation"));

        System.out.println(context.getBean(Person.class));
    }
}
