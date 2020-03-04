package com.mjj.spring.cap9.service;

import com.mjj.spring.cap9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;


    public void println(){
        System.out.println();
    }
}
