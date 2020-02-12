package com.mjj.bean.demo.annotation_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author meijunjie
 */

/**
 * @Configuration 指定配置类 等价与xml配置文件
 */
@Configuration
public class Config {


    /**
     * 默认的bean的name  方法名
     * @return
     */
    @Bean(value = "personAnnotation")
    public Person person(){
        return new Person("meijunjie",12);
    }
}
