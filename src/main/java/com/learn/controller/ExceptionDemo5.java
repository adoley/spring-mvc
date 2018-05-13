package com.learn.controller;

import com.learn.exceptions.BaseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * if we add @ControllerAdvice at BaseException then it is not necessary to extend BaseException class for exception handling,
 * spring will do it automatically
 */
@Controller
public class ExceptionDemo5 extends BaseException{
    @RequestMapping("/exception")
    ModelAndView exception(){
        ModelAndView modelAndView=new ModelAndView("index");

        Boolean ex=true;
        if(ex){
            throw new RuntimeException();
        }
        return modelAndView;
    }
}
