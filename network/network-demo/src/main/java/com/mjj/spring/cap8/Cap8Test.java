package com.mjj.spring.cap8;

import com.mjj.spring.cap8.bean.Bird;
import com.mjj.spring.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap8Test {


    @Test
    public void test(){

        AnnotationConfigApplicationContext conetxt = new AnnotationConfigApplicationContext(Cap8MainConfig.class);


        String[] names = conetxt.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }


        System.out.println(conetxt.getBean(Bird.class));

        System.out.println("IOC容器创建完成...");



        ConfigurableEnvironment environment = conetxt.getEnvironment();

        System.out.println(environment.getProperty("bird.color"));

        conetxt.close();
    }
}
