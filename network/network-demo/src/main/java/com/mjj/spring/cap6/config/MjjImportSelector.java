package com.mjj.spring.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * @Import
 * @ImportSelector
 * @ImportBeanDefinitionRegistry
 */
public class MjjImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.mjj.spring.cap6.bean.Fish",
                "com.mjj.spring.cap6.bean.Tiger"};
    }
}
