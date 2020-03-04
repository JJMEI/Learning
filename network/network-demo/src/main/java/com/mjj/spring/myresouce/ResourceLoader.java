package com.mjj.spring.myresouce;


public interface ResourceLoader {


    String  CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;

    /**
     * 根据资源路径location返回Resource实例 单不确保该实例一定存在 需要调用Resource.exists()方法判断
     *
     * URL位置资源   file:/letv/logs
     * ClassPath 位置资源   classpath:test.dat
     * 相对路径资源 WEB-INF/test.dar
     * @param location
     * @return
     */
    Resource getResource(String location);


    /**
     * 获取类加载器
     * @return
     */
    ClassLoader getClassLoader();
}
