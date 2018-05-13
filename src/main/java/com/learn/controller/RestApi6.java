package com.learn.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestApi6 {

    @ResponseBody
    @RequestMapping(value = "/restapi",method = RequestMethod.GET)
    public String restapi(){

        return "response from rest api";
    }
}
