package com.mjj.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 排除controller层的的bean进入
 */
@ComponentScan(value = "com.mjj",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class MjjRootConfig {

}
