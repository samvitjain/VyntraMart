package com.virtusa.gstbill.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {
    public ModelAndView firstPage(){
        return new ModelAndView("index.html");
    }
}
