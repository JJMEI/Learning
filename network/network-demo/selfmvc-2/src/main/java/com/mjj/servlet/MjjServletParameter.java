package com.mjj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet(value = "/param")
public class MjjServletParameter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("pathInfo  --->" + req.getPathInfo());
        System.out.println("requestURI --->" + req.getRequestURI());
        System.out.println("queryString --->" + req.getQueryString());
        System.out.println("" + req.getParameterNames().toString());

        System.out.println(" " + req.getParameterMap());
        System.out.println();

        Locale locale = req.getLocale();
        System.out.println("当前国家地区 " + locale.getCountry());
        // 302 跳转 浏览器地址栏会也跳转
//        resp.setStatus(302);
        resp.setStatus(301);

        resp.setHeader("Location","/customer");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
