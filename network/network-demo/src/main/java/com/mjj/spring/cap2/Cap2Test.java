package com.mjj.spring.cap2;


import com.mjj.spring.cap2.config.Cap2MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap2Test {

    @Test
    public void test1(){

        ApplicationContext context = new AnnotationConfigApplicationContext(Cap2MainConfig.class);


        /**
         * 获取bean的定义名称
         */
        String[] names = context.getBeanDefinitionNames();

        for(String name : names){
            System.out.println(name);
        }
    }

}
