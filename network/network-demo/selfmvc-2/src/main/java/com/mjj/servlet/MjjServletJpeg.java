package com.mjj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet(value = "/jpeg")
public class MjjServletJpeg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setHeader("content-type","image/jpeg");

        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("single_dog.jpg");

        byte[] buffer = new byte[1024];
        int len=0;
        OutputStream out = resp.getOutputStream();
        while ((len = in.read(buffer)) >0){
            out.write(buffer,0,len);
        }
    }
}
