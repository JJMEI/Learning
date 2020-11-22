package com.mjj.servlet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * @author meijunjie
 *
 * @HandlesTypes 注解将刚兴趣的类 注入到ServletContainerInitializer
 */

@HandlesTypes(value = {MjjService.class})
public class MjjServletContainerInitializer implements ServletContainerInitializer {

    /**
     *
     * @param c    感兴趣的类的子类型
     * @param ctx
     * @throws ServletException
     */
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        System.out.println("感谢兴趣的类型....");

        for(Class<?> clazz : c){
            System.out.println(clazz.getName());
        }



        ctx.addServlet("MjjServlet",MjjServletRegister.class)
           .addMapping("/mjj_register");
//
        ctx.addListener(MjjListener.class);


        // 配置的化是按照顺序
        ctx.addFilter("MjjFilter——2",MjjFilter2.class)
                // 映射拦截的地址
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
//
        ctx.addFilter("MjjFilter——1",MjjFilter.class)
            // 映射拦截的地址
           .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");


    }
}
