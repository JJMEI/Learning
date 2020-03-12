package com.mjj.self.mvc.argumentResolver;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 *
 * 参数解析器
 * @author meijunjie
 */
public interface ArgumentResolver {

    boolean support(Class<?> type, int paramIndex, Method method);

    Object argumentResolver(HttpServletRequest request,
                            HttpServletResponse response,Class<?> type,
                            int paramIndex,
                            Method method);
}
