package com.example.elasticsearchdemo.repository;

import com.example.elasticsearchdemo.entity.BookBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<BookBean,String> {


    Page<BookBean> findByAuthor(String author, Pageable pageable);
    Page<BookBean> findByTitle(String title, Pageable pageable);

}
