package com.mjj.smartframework.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author meijunjie @date 2018/8/7
 */
public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     * @param fileName  属性文件名
     * @return          Properties对象
     */
    public static Properties loadProps(String fileName){
        Properties properties = null;
        InputStream is = null;
        try{
            //   获取当前线程的类加载器，加载属性文件
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(is==null){
                throw new FileNotFoundException(fileName + " this file is not found!");
            }
            properties = new Properties();
            // 载入属性文件
            properties.load(is);
        }catch (IOException e){
            LOGGER.error("Read properties file error, exception_info={}",e);
        }finally {
            if(is!=null){
                try{
                    is.close();
                }catch (Exception e){
                    LOGGER.error("Close input stream failure! exception_info={}",e);
                }
            }
        }
        return properties;
    }

    public static String getString(Properties properties, String key){
        return getString(properties, key, "");
    }

    public static String getString(Properties properties, String key, String defaultValue){
        String value = defaultValue;
        if(properties.contains(key)){
            value = properties.getProperty(key);
        }
        return value;
    }

    public static int getInt(Properties properties, String key){
        return getInt(properties, key, 0);
    }

    public static int getInt(Properties properties, String key, int defaultValue){
        int value = defaultValue;
        if(properties != null && properties.contains(key)){

        }
        return value;
    }
}
