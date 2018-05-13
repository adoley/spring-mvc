package com.learn.controller;

import com.learn.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BindingResult4 {
    @RequestMapping("/binding")
    ModelAndView binding(){
        ModelAndView modelAndView=new ModelAndView("loginBinding");
        return modelAndView;
    }

    /**
     * BindingResult is used to find out if there was any error while binding the form variable with the Person class variables
     * For example Person class has two variable namely firstName and lastName of type String. So while entering the firstName variable in the
     * loginBinding.jsp, if we enter numerical instead of String the BindingResult will held the binding error.
     * @param person
     * @param result
     * @return
     */
    @RequestMapping("/binding/submit")
    ModelAndView bindingSubmit(@ModelAttribute("individual")Person person, BindingResult result){


        if(result.hasErrors()){
            ModelAndView modelAndView=new ModelAndView("loginBinding");
            return modelAndView;
        }
        ModelAndView modelAndView=new ModelAndView("personModel");
        modelAndView.addObject("msg","hi");
        return modelAndView;
    }
}
