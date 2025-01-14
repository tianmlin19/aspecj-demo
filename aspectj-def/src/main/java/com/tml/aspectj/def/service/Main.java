package com.tml.aspectj.def.service;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        DefService defService = new DefService();
        String s = defService.sayHello("tml");
        System.out.println(s);

    }
}
