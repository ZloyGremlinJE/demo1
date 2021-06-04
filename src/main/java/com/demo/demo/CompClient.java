package com.demo.demo;

public class CompClient {

    void printCC(){
        System.out.println("I am compClient!");
    };
   // @PostConstruct
    public void initialize() {
        System.out.println("Creat compClient!");
    }

    //@PreDestroy
    public void destroy(){
        System.out.println("Kill Bill!!");
    }

}
