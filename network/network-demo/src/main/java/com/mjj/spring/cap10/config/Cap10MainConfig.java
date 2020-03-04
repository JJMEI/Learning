package com.mjj.spring.cap10.config;

import com.mjj.spring.cap10.aop.Calculator;
import com.mjj.spring.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 日志切面类的方法需要动态感知到div方法运行
 * 通知方法
 *      前置通知  logStart(),在我们执行div()之前运行
 *      后置通知  logEnd()  在目标方法div运行结束之后，不管有没有异常
 *      返回通知  logReturn() 在目标方法正常返回值后运行
 *      异常通知  logException()  在我们目标方法执行出现异常后韵x
 *      环绕通知   动态代理  需要手动执行joinPoint.proceed()
 *
 *
 *      @EnableAspect
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {


    @Bean
    public Calculator calculator(){
        return new Calculator();
    }


    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }


}
