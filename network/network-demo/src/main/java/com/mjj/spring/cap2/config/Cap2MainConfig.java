package com.mjj.spring.cap2.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author meijunjie
 */
@Configuration

/**
 * 组件扫描
 * @ComponentScan 组件扫描
 * 可以使用过滤规则
 * @FilterType
 */
@ComponentScan(
        value = "com.mjj.spring.cap2",
        includeFilters = {
                            @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},
        useDefaultFilters = false)
public class Cap2MainConfig {
}
