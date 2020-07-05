package com.mjj.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author meijunjie
 */
@WebFilter
public class MjjFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 过滤拦截， 拦截器链
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MjjFilter... do Filter...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
