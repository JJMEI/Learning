package com.mjj.spring.self.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;



/**
 * ---person
 * @author meijunjie
 */
public class Person implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{


    private String name;
    private String age;
    private String beanName;
    private BeanFactory beanFactory;
    private Animal pet;

    public Person(){

    }

    public Person(String name, String age, String beanName, BeanFactory beanFactory, Animal pet) {
        this.name = name;
        this.age = age;
        this.beanName = beanName;
        this.beanFactory = beanFactory;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", beanName='" + beanName + '\'' +
                ", beanFactory=" + beanFactory +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("person bean destroy method is invoked....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("person bean initialing method is invoked...");
    }


    public void initMethod(){
        System.out.println("init-method is invoked...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }


}
