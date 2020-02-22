package com.mjj.spring.cap5;

import com.mjj.spring.cap1.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Cap5Config {


    @Conditional(MacCondition.class)
    @Bean
    public Person person(){
        return new Person("Mjj",111);
    }
}
