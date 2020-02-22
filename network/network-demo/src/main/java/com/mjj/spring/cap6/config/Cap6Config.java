package com.mjj.spring.cap6.config;


import com.mjj.spring.cap6.bean.Cat;
import com.mjj.spring.cap6.bean.Dog;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Dog.class,Cat.class, MjjImportSelector.class})
public class Cap6Config {
}
