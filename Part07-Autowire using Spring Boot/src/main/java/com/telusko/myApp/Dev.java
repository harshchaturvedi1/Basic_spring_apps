package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//    field injection & setter injection requires autowire


    //                     Laptop laptop=null;
//    option1 is do  Laptop laptop = new Laptop();
//    option 2 is Autowired

//    Laptop laptop; // this is instance variable and by default it will get value null i.e.

//    field injection 
//    @Autowired // this is called field injection , but if we don;t wanna go this way we can also use constructor as below
//    private Laptop laptop;

//    constructor injection
//    private Laptop laptop;
//    public Dev(Laptop laptop) {
//        this.laptop = laptop; // this is called constructor injection
//    }

    //    setter injection
//    private Laptop laptop;
//
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    @Autowired
    @Qualifier("desktop") // name of class will be in small laters
    private Computer comp;

    public void build() {
//        laptop.compile();
        comp.compile();
        System.out.println("Working on awesome project");
    }

}
