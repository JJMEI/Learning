package com.mjj.self.mvc.handlerAdapter;

import com.mjj.self.mvc.annotation.MjjService;
import com.mjj.self.mvc.argumentResolver.ArgumentResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author meijunjie
 */

@MjjService("mjjHandlerAdapter")
public class MjjHandlerAdapter implements HandlerAdapterService {
    @Override
    public Object[] hand(HttpServletRequest request, HttpServletResponse response, Method method, Map<String, Object> beans) {

        // 拿到当前待执行的方法有哪些参数
        Class<?>[] paramClazzs = method.getParameterTypes();


        Object[] args = new Object[paramClazzs.length];

        Map<String,Object> argumentResolvers = getBeansOfType(beans, ArgumentResolver.class);


        int paramIndex = 0;
        int i = 0;

        for(Class<?> paramClazz : paramClazzs){
            for(Map.Entry<String,Object> entry : argumentResolvers.entrySet()){
                ArgumentResolver ar = (ArgumentResolver) entry.getValue();

                if(ar.support(paramClazz,paramIndex,method)){
                    args[i++] = ar.argumentResolver(request,response,paramClazz,paramIndex,method);
                }
            }
            paramIndex++;
        }
        return args;
    }


    /**
     *
     * @param beans                 所有beans
     * @param intfType
     * @return
     */
    private Map<String,Object> getBeansOfType(Map<String, Object> beans, Class<?> intfType) {

        Map<String,Object> resultBeans = new HashMap<>();

        for(Map.Entry<String,Object> entry : beans.entrySet()){
            Class<?>[] intfs = entry.getValue().getClass().getInterfaces();

            if(intfs != null && intfs.length > 0){
                for(Class<?> intf : intfs){
                    if(intf.isAssignableFrom(intfType)){
                        resultBeans.put(entry.getKey(),entry.getValue());
                    }
                }
            }
        }

        return resultBeans;
    }
}
