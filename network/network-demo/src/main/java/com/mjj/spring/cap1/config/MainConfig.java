package com.mjj.spring.cap1.config;

import com.mjj.spring.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Configuration 代表一个配置类   等价于 配置文件
 */
@Configuration
public class MainConfig {

    /**
     * 不显示的指定bean的名字则取方法名
     *
     * 可以直接获取bean的信息
     * @return
     */
    @Bean(name = "personByAnnotation")
    public Person person(){
        return new Person("Mjj",29);
    }
}
