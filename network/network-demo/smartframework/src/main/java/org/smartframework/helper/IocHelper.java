package org.smartframework.helper;

import org.apache.commons.lang3.ArrayUtils;
import org.smartframework.annotation.Inject;
import org.smartframework.util.CollectionUtil;
import org.smartframework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 *
 * @author meijunjie
 * @date 2018/8/13
 */
public final class IocHelper {

    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();

        if(CollectionUtil.isNotEmpty(beanMap)){
            // 遍历BeanMap
            for(Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet())
            {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                // 获取bean类定义的所有成员变量，但不包括继承而来的字段
                Field[] beanFields = beanClass.getDeclaredFields();
                if(ArrayUtils.isNotEmpty(beanFields))
                {
                    // 遍历所有的Field
                    for(Field beanField : beanFields)
                    {
                        // 是否有@Inject注解
                        if(beanField.isAnnotationPresent(Inject.class))
                        {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null)
                            {
                                // 通过反射初始化BeanField的值
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
