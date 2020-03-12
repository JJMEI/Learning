package com.mjj.self.mvc.argumentResolver;

import com.mjj.self.mvc.annotation.MjjService;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


/**
 * @author meijunjie
 */
@MjjService("httpServletRequestArgumentResolver")
public class HttpServletRequestArgumentResolver implements ArgumentResolver {

    /**
     * 判断传进来的参数是否为request
     * @param type
     * @param paramIndex
     * @param method
     * @return
     */
    @Override
    public boolean support(Class<?> type, int paramIndex, Method method) {
        return ServletRequest.class.isAssignableFrom(type);
    }

    /**
     * 如果传进来的参数是request 直接返回
     * @param request
     * @param response
     * @param type
     * @param paramIndex
     * @param method
     * @return
     */
    @Override
    public Object argumentResolver(HttpServletRequest request, HttpServletResponse response, Class<?> type, int paramIndex, Method method) {
        return request;
    }
}
