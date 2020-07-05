package com.mjj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;


@WebServlet(value = "/MJJ")
public class MjjServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String outContent = "this is MJJ's servlet....this is MJJ's servlet....this is MJJ's servlet....this is MJJ's servlet....this is MJJ's servlet....this is MJJ's servlet....this is MJJ's servlet....";
        System.out.println("原始数据大小： " + outContent.getBytes().length);

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        GZIPOutputStream gout = new GZIPOutputStream(bout);

        gout.write(outContent.getBytes());

        gout.close();

        byte[] g = bout.toByteArray();
        resp.setHeader("Content-Encoding","gzip");
        resp.setHeader("Content-Length","" + g.length);





        resp.getOutputStream().write(g);
    }
}
