package com.tml.aspectj.user.service;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserService userService = new UserService();
        String s = userService.sayHello("tml");
        System.out.println(s);

    }
}
