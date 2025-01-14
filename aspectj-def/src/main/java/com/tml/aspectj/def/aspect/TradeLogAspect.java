package com.tml.aspectj.def.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TradeLogAspect {

    @Pointcut("@annotation(com.tml.aspectj.def.aspect.TradeLog) && execution(* *(..))")
    private void tradeLogPoint() {

    }

    @Around("tradeLogPoint()")
    public Object tradeLogWithAspectJ(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("TradeLogAspect.tradeLogPoint begin");
        Object proceed = joinPoint.proceed();
        System.out.println("TradeLogAspect.tradeLogPoint end, --costTime :" + (System.currentTimeMillis() - startTime));
        return proceed;
    }
}
