package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to simple web app";
    }

    @RequestMapping("/about")
    public String about(){
        return "this is about page";
    }
}