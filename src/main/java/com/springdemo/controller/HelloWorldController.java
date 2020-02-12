package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloWorldController {

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

    @RequestMapping("processForm2")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Hey " + name;

        model.addAttribute("message", result);

        return "main/helloworld";
    }

    @RequestMapping("processForm3")
    public String processForm3(@RequestParam("studentName") String name, Model model){

        name = name.toUpperCase();

        String result = "Hey from V3 " + name;

        model.addAttribute("message", result);

        return "main/helloworld";
    }

}
