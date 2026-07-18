package com.telusko.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

        Dev obj = context.getBean(Dev.class);
        obj.build();

//      NOTE: this is normal way to create objects
/*
        Dev obj = new Dev();
        obj.build();
*/

//      NOTE: way2
//      this will throw null pointer exception error
/*
        Dev obj = null;
        obj.build();
 */


    }

}
