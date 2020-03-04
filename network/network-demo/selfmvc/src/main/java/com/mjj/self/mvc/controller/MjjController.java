package com.mjj.self.mvc.controller;

import com.mjj.self.mvc.annotation.MjjQualifier;
import com.mjj.self.mvc.annotation.MjjRequestMapping;
import com.mjj.self.mvc.annotation.MjjRequestParam;
import com.mjj.self.mvc.service.MjjService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@com.mjj.self.mvc.annotation.MjjController
@MjjRequestMapping("/mjj")
public class MjjController {



    @MjjQualifier("mjjServiceImpl")
    private MjjService mjjService;

    @MjjRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response,
                      @MjjRequestParam("name") String name,@MjjRequestParam("age") String age) throws IOException {


        PrintWriter printWriter = response.getWriter();

        String result = mjjService.query(name,age);
    }
}
