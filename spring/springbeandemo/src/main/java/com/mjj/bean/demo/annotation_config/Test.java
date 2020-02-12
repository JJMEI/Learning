package com.mjj.bean.demo.annotation_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println(context.getBean("person"));



        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(Config.class);

        System.out.println(annotationContext.getBean("personAnnotation"));


        for(String name : annotationContext.getBeanNamesForType(Person.class)){
            System.out.println(name);
        }
    }
}
