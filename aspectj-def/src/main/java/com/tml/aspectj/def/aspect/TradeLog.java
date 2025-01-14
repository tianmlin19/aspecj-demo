package com.tml.aspectj.def.aspect;

import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TradeLog {
}
