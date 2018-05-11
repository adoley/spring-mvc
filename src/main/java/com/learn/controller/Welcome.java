package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcome {
    @RequestMapping("/welcome")
    public ModelAndView welcome(){
            ModelAndView modelAndView=new ModelAndView("index");
            modelAndView.addObject("welcomeMsg","test");
            return modelAndView;
    }
}
