package com.example.No_dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    // ------------ behaviour 1 ---------
    @Autowired // field injection
    @Qualifier("laptop")
    /*
    use this qualifier when don't wanna use primary
     */
//    private Laptop laptop;
    private Computer comp;

    // if AutoWired not used above than use here
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
    // ------------ behaviour 1 ---------\



    // ------------ behaviour 2 ---------
    // work around if don't wanna do field injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }
    // ------------ behaviour 2 ---------


    public void build() {
//        laptop.compile();
        comp.compile();
        System.out.println("Working in new project");
    }
}
