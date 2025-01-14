package com.tml.aspectj.user.service;

import com.tml.aspectj.def.service.DefService;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        DefService defService = new DefService();
        String s = defService.sayHello("aspectj");
        System.out.println(s);

    }
}
