package com.mjj.self.mvc.annotation;


import java.lang.annotation.*;

/**
 * @author meijunjie
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MjjRequestParam {

    String value() default "";
}
