package com.young.aop;

import com.young.common.Helper;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Arrays;

@Aspect
@Component
@Order(1)
public class LogAop {

    @Pointcut("execution(public * com.young.controller.*(..))")
    public void HTTPRequestPointCut() {}

    @Before("com.young.aop.LogAop.HTTPRequestPointCut()")
    public void LogAopBefore(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        HttpServletRequest req = (HttpServletRequest) objects[0];
        String traceId = Helper.getTraceId(req);
        System.out.println("[" + Instant.now() + "][" + traceId + "]LogAop Before Method : " + joinPoint.getSignature().getName());

    }
}
