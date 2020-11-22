package com.mjj.spring.self.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

import java.util.Date;

/**
 * @author meijunjie
 */
public class NextDayDateFactoryBean implements FactoryBean {
    @Nullable
    @Override
    public Object getObject() throws Exception {
        return new Date();
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
