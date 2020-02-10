package com.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

//    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @RequestMapping("SpringMVC")
    public String showPage(){
        return "main-menu";
    }

    @RequestMapping("showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("processForm")
    public String showHello(){
        return "helloworld";
    }

    @RequestMapping("processForm2")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Hey " + name;

        model.addAttribute("message", result);

        return "helloworld";
    }

}
