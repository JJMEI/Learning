package com.mjj.tomcat.chapter2;


import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

/**
 * TODO servlet资源处理器
 * @author meijunjie
 */
public class ServletProcessor {

    public void process(Request request, Response response) throws IOException {
        String uri = request.getUri();

        String servletName = uri.substring(uri.lastIndexOf("/") + 1);
        URLClassLoader loader = null;
        URL[] urls = new URL[1];
        URLStreamHandler streamHandler = null;
        String repository = Constants.WEB_ROOT;

        urls[0] = new URL(null,repository,streamHandler);

        loader = new URLClassLoader(urls);

        Class myClass = null;

        try{
            myClass = loader.loadClass(servletName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Servlet servlet = null;
        try{
            servlet = (Servlet) myClass.newInstance();

            servlet.service(request,response);
        } catch (IllegalAccessException | InstantiationException | IOException | ServletException e) {
            e.printStackTrace();
        }

    }
}
