package com.young.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Aspect
@Component
@Order(2)
public class LoginAop {
    @Pointcut("execution(public * com.young.controller.*(..))")
    public void LoginAopPointCut() {}

    @Before("com.young.aop.LoginAop.LoginAopPointCut()")
    public void LoginAopBefore(JoinPoint joinPoint) {
        System.out.println("[" + Instant.now() + "]" + "Login Aop Before " + joinPoint.getSignature().getName());

    }
}
