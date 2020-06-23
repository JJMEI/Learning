package com.mjj.dao;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;
import org.jfaster.mango.operator.cache.SimpleCacheHandler;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by leichen on 2020/4/14.
 */
@Slf4j
public class MangoCacheHandler extends SimpleCacheHandler implements InitializingBean {
    @Override
    public Object get(String key, Type type) {

        return null;
    }

    @Override
    public Map<String, Object> getBulk(Set<String> keys, Type type) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void set(String key, Object value, int expirtimeSeconds) {
        String s = JSON.toJSONString(value);
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Mango cache hanlder initialized!");
    }
}
