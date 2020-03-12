package com.mjj.self.mvc.argumentResolver;

import com.mjj.self.mvc.annotation.MjjRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RequsetParamArgumentResolver implements ArgumentResolver {

    /**
     * 解析声明注解为RequestParam 获取注解的值
     * @param type
     * @param paramIndex
     * @param method
     * @return
     */
    @Override
    public boolean support(Class<?> type, int paramIndex, Method method) {
        Annotation[][] an = method.getParameterAnnotations();
        Annotation[] paramAns = an[paramIndex];

        for(Annotation paramAn : paramAns){
            if(MjjRequestParam.class.isAssignableFrom(paramAn.getClass())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object argumentResolver(HttpServletRequest request, HttpServletResponse response, Class<?> type, int paramIndex, Method method) {

        Annotation[][] an = method.getParameterAnnotations();
        Annotation[] paramAns = an[paramIndex];

        for(Annotation paramAn : paramAns){
            if(MjjRequestParam.class.isAssignableFrom(paramAn.getClass())){

                MjjRequestParam rp = (MjjRequestParam) paramAn;
                String value = rp.value();
                return request.getParameter(value);
            }
        }

        return null;
    }
}
