package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@RequestMapping("/hello")
public class HomeController {

//    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @RequestMapping("SpringMVC")
    public String showPage(){
        return "main/main-menu";
    }

    @RequestMapping("showForm")
    public String showForm(){
        return "main/helloworld-form";
    }

    @RequestMapping("processForm")
    public String showHello(){
        return "main/helloworld";
    }

}
