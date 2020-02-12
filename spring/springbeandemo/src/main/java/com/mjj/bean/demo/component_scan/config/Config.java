package com.mjj.bean.demo.component_scan.config;


import com.mjj.bean.demo.xml_config.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author meijunjie
 */
@Configuration
@ComponentScan(value = "com.mjj.bean.demo.component_scan")
public class Config {

    @Bean(value = "myPerson")
    public Person person(){
        return new Person("ddddd",122);
    }
}
