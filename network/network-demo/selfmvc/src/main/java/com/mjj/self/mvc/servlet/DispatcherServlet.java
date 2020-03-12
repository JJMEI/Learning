package com.mjj.self.mvc.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

/**
 * @author meijunjie
 */
public class DispatcherServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;

    List<String> classNames = new ArrayList<>();

    Map<String,Object> beans = new HashMap<>();

    Map<String,Object> handlerMap = new HashMap<>();

    Properties properties = null;


    private static String HANDLERADAPTER = "mjjHandlerAdapter";


    public DispatcherServlet(){

    }


    @Override
    public void init(ServletConfig config) throws ServletException {

        // 根据一个基本包进行扫描 扫描里面的子包以及子包下面的类
        scanPackage("com.mjj.self.mvc");

        for(String className : classNames){
            System.out.println(className);
        }


        // 将扫描出来的类进行实例化
        instance();

        for(Map.Entry<String,Object> entry : beans.entrySet()){
            System.out.println("完成实例化的bean...");
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        // 进行依赖注入，把service的实例租入到controller
        ioc();

        // 建立一个path与method的映射关系
        handlerMapping();

        for (Map.Entry<String,Object> entry : handlerMap.entrySet()){
            System.out.println("path映射method...");
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取到请求路径
        String uri = req.getRequestURI();

        String context = req.getContextPath();

        // 将 "/mjj-springmvc/mjj/query" 去掉"/mjj-springmvc"
        String path = uri.replace(context,"");

        // 根据请求路径获取要执行的方法
        Method method = (Method) handlerMap.get(path);


        // 拿到控制类

    }

    private void handlerMapping() {
    }

    private void ioc() {
    }

    private void instance() {
    }

    private void scanPackage(String basePackage) {
        // 扫描编译好的类路径下的所有类

        URL url = this.getClass().getClassLoader().getResource("/" + replaceTo(basePackage));

        String fileStr = url.getFile();

        File file = new File(fileStr);

        String[] filesStr = file.list();

        for(String path : filesStr){
            File filePath = new File(fileStr + path);

            if(filePath.isDirectory()){
                scanPackage(basePackage + "." + path);
            }
        }


    }

    private String replaceTo(String basePackage) {

        return basePackage.replace("\\.","/");
    }
}
