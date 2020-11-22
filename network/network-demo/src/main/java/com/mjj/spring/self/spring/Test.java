package com.mjj.spring.self.spring;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.*;

public class Test {

    public static void main(String[] args) throws Exception {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaCode(beanRegistry);
        System.out.println(container.getBean("person"));
    }



    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry) throws Exception{
        AbstractBeanDefinition personBeanDefinition = new RootBeanDefinition();
        personBeanDefinition.setBeanClass(Person.class);
        personBeanDefinition.setScope("singleton");

        // 将bean定义注册到容器中
        registry.registerBeanDefinition("person",personBeanDefinition);

        // 通过setter方法注入方式
        // 指定依赖关系  选择 setter注入 或者 constructor注入
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name","梅俊杰"));
        propertyValues.addPropertyValue(new PropertyValue("age",18));
        personBeanDefinition.setPropertyValues(propertyValues);
        return (BeanFactory) registry;

    }
}
