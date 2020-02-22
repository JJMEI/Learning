package com.mjj.spring.cap2.filter;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class SelfTypeFilter implements TypeFilter {


    private ClassMetadata classMetadata;

    /**
     *
     * @param metadataReader             元数据，读取到当前正在扫描类的信息
     * @param metadataReaderFactory      可以获取到其他任何类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        classMetadata = metadataReader.getClassMetadata();




        return false;
    }
}
