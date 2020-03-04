package com.mjj.self.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author meijunjie
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MjjRequestMapping {

    String value() default "";

}
