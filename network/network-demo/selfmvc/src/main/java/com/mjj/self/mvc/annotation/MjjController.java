package com.mjj.self.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author meijunjie
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MjjController {
    String value() default "";
}
