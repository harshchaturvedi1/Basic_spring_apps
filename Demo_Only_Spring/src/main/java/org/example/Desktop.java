package org.example;

// this is for achieving the @Autowire -> similar to spring boot

public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop constructor");
    }

    public void compile(){
        System.out.println("Compiling in desktop");
    }
}
