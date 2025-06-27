package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // this will work as we are creating object ourselves
        // so first we need this IOC container , but even before we create object ,
        // we need to create this container

        // if we don't want object here , we need Application context here,
        // but we don't have context  yet

        // and for that we need to add dependency in the pom.xml file
        // we need dependency , so require dependency name , artifactID and version
        // need to check spring context
        /*
        Dev obj = new Dev();
        obj.build();
        */

        // now we need spring to give this object
//ClassPathXmlApplicationContext is used for starting the container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = context.getBean(Dev.class);
        // type caste with Dev
        Dev obj = (Dev) context.getBean("dev");
        obj.build();
        System.out.println((obj.getAge()));
    }
}
