package com.mjj.slef.distribution.selfsnowflakedistribution.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.annotation.Resource;


/**
 * @author meijunjie
 */
@Configuration
public class ServerConfig {


    @Resource
    private RedisTemplate<String,String> redisTemplate;


    @Bean(value = "redisTemplateWithString")
    public RedisTemplate<String,String> redisTemplateWithString(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
