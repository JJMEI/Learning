package com.mjj.spring.cap12;

import com.mjj.spring.cap12.config.Cap12MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap12Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap12MainConfig.class);

        context.close();
    }
}
