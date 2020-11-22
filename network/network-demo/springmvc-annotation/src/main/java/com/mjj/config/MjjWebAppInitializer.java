package com.mjj.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MjjWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 获取根容器的配置类  父容器
     * @return
     */
    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MjjRootConfig.class};
    }

    /**
     * 获取web容器的配置类， Springmvc的配置文件 子容器
     * @return
     */
    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MjjAppConfig.class};
    }

    /**
     * 获取dispatcherservlet的映射信息
     *  / 拦截所有请求 包括静态资源 但不包括jsp
     *  /* 拦截所有请求 连jsp都拦截
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
