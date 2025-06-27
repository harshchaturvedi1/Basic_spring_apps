package com.example.No_dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NoDependencyApplication {

	public static void main(String[] args) {

//		SpringApplication.run(NoDependencyApplication.class, args);
		ApplicationContext context = SpringApplication.run(NoDependencyApplication.class,args);
//		Dev obj = new Dev();

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
