package org.example;

public class Dev {

    // one way is to create the object
    // but if we need spring to give this object
//    private Laptop laptop;
    private Computer comp;

    private int age;
    public Dev() {
        System.out.println("inside dev constructor");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        System.out.println("Working on Awesome project");
//        laptop.compile();
        comp.compile();
    }
}
