package com.example.No_dependency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
/*
use this when multiple classes are implementing
same interface and we wanna priorities this one
 */
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling with 404 error");
    }
}




