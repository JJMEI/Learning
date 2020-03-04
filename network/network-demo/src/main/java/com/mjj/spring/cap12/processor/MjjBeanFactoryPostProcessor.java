package com.mjj.spring.cap12.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * BeanFactory后置处理器的功能是与BeanFactory相关的
 */

@Component
public class MjjBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MjjBeanFactoryPostProcessor...调用BeanFactoryPostProcessor"  );

        int count = beanFactory.getBeanDefinitionCount();
        String[] beanDefName = beanFactory.getBeanDefinitionNames();

        System.out.println("当前beanfactory中有 " + count + " beanDefinition..." + Arrays.toString(beanDefName));



    }
}
