package com.mjj.spring.cap10;

import com.mjj.spring.cap10.aop.Calculator;
import com.mjj.spring.cap10.config.Cap10MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap10Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap10MainConfig.class);


        Calculator calculator = context.getBean(Calculator.class);

        int result = calculator.div(1,2);

        System.out.println(result);

        context.close();
    }
}
