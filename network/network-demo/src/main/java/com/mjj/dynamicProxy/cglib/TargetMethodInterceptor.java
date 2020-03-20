package com.mjj.dynamicProxy.cglib;



import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * 目标对象的拦截器，实现MethodInterceptor
 * @author meijunjie
 */
public class TargetMethodInterceptor implements MethodInterceptor {

    /**
     *
     * @param o              cglib生成的代理类实例
     * @param method         被代理类的方法引用
     * @param objects        方法参数
     * @param methodProxy    CGLIB代理类的方法引用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("调用前。。。");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("调用后。。。" + result);
        return result;
    }
}
