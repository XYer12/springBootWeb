package com.young.aop;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class LogAop {

    @Pointcut()
    public void HTTPRequestPointCut() {}

    @Before("com.young.aop.LogAop.HTTPRequestPointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("LogAop Before Method : " + joinPoint.getSignature().getName());
        Object[] objects = joinPoint.getArgs();
        HttpServletRequest req = (HttpServletRequest) objects[0];

    }
}
