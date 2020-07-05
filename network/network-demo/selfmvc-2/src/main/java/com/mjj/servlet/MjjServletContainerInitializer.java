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
 */

@HandlesTypes(value = {MjjService.class})
public class MjjServletContainerInitializer implements ServletContainerInitializer {

    /**
     *
     * @param c
     * @param ctx
     * @throws ServletException
     */
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        ctx.addServlet("MjjServlet",MjjServletRegister.class)
           .addMapping("/mjj_register");

        ctx.addListener(MjjListener.class);

        ctx.addFilter("MjjFilter",MjjFilter.class)
            // 映射拦截的地址
           .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
    }
}
