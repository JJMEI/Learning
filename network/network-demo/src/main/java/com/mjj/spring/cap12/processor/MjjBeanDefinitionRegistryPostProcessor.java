package com.mjj.spring.cap12.processor;

import com.mjj.spring.cap12.bean.Moon;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;


/**
 * bean的定义注册后置处理器
 */
@Component
public class MjjBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("postProcessBeanDefinitionRegistry... bean的数量 " + registry.getBeanDefinitionCount());

        RootBeanDefinition rdb = new RootBeanDefinition(Moon.class);
        registry.registerBeanDefinition("MoonRegistry",rdb);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory... bean的数量 " + beanFactory.getBeanDefinitionCount());
    }
}
