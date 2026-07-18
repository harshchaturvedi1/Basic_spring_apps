package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Compile with 404 error but faster");
    }
}
