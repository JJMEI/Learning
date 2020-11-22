package com.mjj.spring.self.spring;

import org.springframework.beans.BeanWrapperImpl;

public class BeanWrapperTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Object person = Class.forName("com.mjj.spring.self.spring.Person").newInstance();

        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(person);

        // 使用BeanWrapper 操作对象
        beanWrapper.setPropertyValue("name","mjjjj");
        beanWrapper.setPropertyValue("age",11111);

        System.out.println(beanWrapper.getRootInstance().toString());

    }
}
