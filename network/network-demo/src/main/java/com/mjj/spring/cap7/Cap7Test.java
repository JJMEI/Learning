package com.mjj.spring.cap7;

import com.mjj.spring.cap7.config.Cap7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap7Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);


        /**
         * 1. 调用无参构造方法
         * 2. 执行初始化方法
         * 3. 容器创建完成
         * 4. 消耗
         */
        System.out.println("IOC容器创建完成....");

        // 关闭容器
        context.close();
    }
}
