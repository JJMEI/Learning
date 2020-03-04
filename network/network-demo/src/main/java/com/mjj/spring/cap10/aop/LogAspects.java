package com.mjj.spring.cap10.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

// 日志切面类

@Aspect
public class LogAspects {

    @Pointcut(value = "execution(public int com.mjj.spring.cap10.aop.Calculator.*(..))")
    public void pointCut(){};



    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + "除法运行...参数列表是:{"+

                Arrays.toString(joinPoint.getArgs())+"}");
    }


    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法运行结束...");

    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Integer result){
        System.out.println("除法正常返回...运行结果:{"+result+"}");
    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("除法运行异常....异常信息:{"+exception+"}");
    }


    @Around("pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around: 执行目标方法之前...");
        Object o = proceedingJoinPoint.proceed();

        System.out.println("@Around: 执行目标方法之后...");
        return o;
    }



}
