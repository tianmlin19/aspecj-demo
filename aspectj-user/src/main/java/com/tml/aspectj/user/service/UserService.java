package com.tml.aspectj.user.service;

import com.tml.aspectj.def.aspect.TradeLog;

public class UserService {

    @TradeLog
    public String  sayHello(String name) throws InterruptedException {
        Thread.sleep(1500);
        return "你好 " + name;
    }
}
