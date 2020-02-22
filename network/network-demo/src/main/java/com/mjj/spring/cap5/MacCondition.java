package com.mjj.spring.cap5;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MacCondition implements Condition {


    /**
     * ConditionContext  判断条件能使用的上下文环境
     * AnnotatedTypeMetadata 注释信息
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {


        // 1. 获取到IOC使用的BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // 2. 获取到类加载器
        ClassLoader classLoader = context.getClassLoader();

        // 3. 获取当前的环境信息
        Environment environment = context.getEnvironment();


        // 4. 获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();


        // 获取
        String property = environment.getProperty("os.name");

        System.out.println("当前操作系统信息: " + property);
        if(property.contains("Mac")){
            return true;
        }

        return false;
    }
}
