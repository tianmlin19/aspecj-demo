package com.tml.aspectj.def.service;

import com.tml.aspectj.def.aspect.TradeLog;

public class DefService {

    @TradeLog
    public String  sayHello(String name) throws InterruptedException {
        Thread.sleep(1500);
        return "Hello " + name;
    }
}
