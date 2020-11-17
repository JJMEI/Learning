package com.mjj.tomcat.chapter2;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author meijunjie
 */
public class PrimitiveServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init.....");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("from service....");
        PrintWriter printWriter = res.getWriter();
        //
        printWriter.println("Hello, Roses are red.");

        //
        printWriter.print("Violets are blue");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy....");
    }
}
