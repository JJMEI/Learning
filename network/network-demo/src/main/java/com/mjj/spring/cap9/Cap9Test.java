package com.mjj.spring.cap9;

import com.mjj.spring.cap9.config.Cap9MainConfig;
import com.mjj.spring.cap9.dao.TestDao;
import com.mjj.spring.cap9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        TestService testService = context.getBean(TestService.class);

        testService.println();
        TestDao testDao = context.getBean(TestDao.class);

        System.out.println(testDao);

        context.close();

    }
}
