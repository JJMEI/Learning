package com.mjj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author meijunjie
 *
 *
 * 如何创建一个Servlet
 *  1. 继承基类HttpServlet 并实现doGet doPost方法以便支持get、post请求
 *  2. 使用@WebServlet注解并配置请求路径，对外发布Servlet服务
 *
 *
 *
 */

@WebServlet(name = "com.mjj.servlet.HelloServlet",value ="/hello" )
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        req.setAttribute("currentTime",currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }

    public static void main(String[] args) {
        System.out.println(1127>>2);
    }
}
