package com.mjj.spring.self.spring;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 *
 * spring 如何解决循环依赖
 * @author meijunjie
 */
public class BeanFactoryTest {

    public static void main(String[] args) {
        ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        beanFactory.addBeanPostProcessor(new BeanPostProcessorExample());
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

        Animal pet = (Animal) beanFactory.getBean("animal");
        System.out.println(pet.toString());

        System.out.println(beanFactory.getBean("person").hashCode());

        System.out.println(beanFactory.getBean("person").hashCode());


        BarInterface barInterface = (BarInterface) beanFactory.getBean("bar");

        System.out.println(barInterface.sayHello());


        System.out.println(((BarInterface)beanFactory.getBean("bar2")).sayHello());


        // 实现了FactoryBean    获取bean 生产的对象
        // &nextDate
        System.out.println(beanFactory.getBean("nextDate"));
        System.out.println(beanFactory.getBean("&nextDate"));

        if(beanFactory.getBean("&nextDate") instanceof NextDayDateFactoryBean){
            System.out.println("hello 获取产生对象的 工厂 ");
        }


    }
}
