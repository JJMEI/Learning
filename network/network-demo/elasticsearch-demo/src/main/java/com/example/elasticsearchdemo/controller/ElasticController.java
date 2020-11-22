package com.example.elasticsearchdemo.controller;

import com.example.elasticsearchdemo.entity.BookBean;
import com.example.elasticsearchdemo.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author meijunjie
 */
@RestController
public class ElasticController {

    @Resource
    private BookService bookService;



    @RequestMapping("/book/{id}")
    public BookBean getBookById(@PathVariable String id){
        Optional<BookBean> opt = bookService.findById(id);
        BookBean bookBean = opt.get();
        System.out.println(bookBean);
        return bookBean;
    }


    @RequestMapping(value = "/book/save",method = {RequestMethod.POST})
    public void save(@RequestBody BookBean bookBean){
        bookService.save(bookBean);
    }
}
