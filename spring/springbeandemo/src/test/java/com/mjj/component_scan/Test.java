package com.mjj.component_scan;

import com.mjj.bean.demo.component_scan.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    @org.junit.Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        for (String name : context.getBeanDefinitionNames()){
            System.out.println(name);
        }
    }
}
