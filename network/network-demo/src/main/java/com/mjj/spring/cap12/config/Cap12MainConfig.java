package com.mjj.spring.cap12.config;

import com.mjj.spring.cap12.bean.Moon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author meijunjie
 */
@Configuration
@ComponentScan(value = "com.mjj.spring.cap12.processor")
public class Cap12MainConfig {

    @Bean
    public Moon moon(){
        return new Moon();
    }
}
