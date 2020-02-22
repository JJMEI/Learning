package com.mjj.spring.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;


@Component
public class MjjBeanPostProcessor implements BeanPostProcessor{


    /**
     * 初始化之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization...." + beanName + "..." + bean);
        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessAfterInitialization...." + beanName + "..." + bean);

        return bean;
    }
}
