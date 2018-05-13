package com.learn.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

public class BaseException {
    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value= java.lang.Exception.class)
    ModelAndView exception(Exception e){
        ModelAndView modelAndView=new ModelAndView("exception");
        modelAndView.addObject("exception",e);
        return modelAndView;
    }
}
