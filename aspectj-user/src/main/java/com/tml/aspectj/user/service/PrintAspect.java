package com.tml.aspectj.user.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PrintAspect {

    @Pointcut("execution(* com.tml.aspectj.def.service.*.*(..))")
    private void print() {

    }

    @Before("print()")
    public void before(JoinPoint joinPoint) {
        System.out.println("当前类className"+joinPoint.getTarget().getClass());
    }
}
