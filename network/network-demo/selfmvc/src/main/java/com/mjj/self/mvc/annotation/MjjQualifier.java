package com.mjj.self.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author meijunjie
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MjjQualifier {
    String value() default "";
}
