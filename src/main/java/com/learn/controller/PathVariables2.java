package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class PathVariables2 {

    /**
     * If called using for e.g http://localhost:8080/spring/hello then pathVariable method will execute
     * If called using for e.g http://localhost:8080/spring/hello/jello then multiplePathVariable method will execute
     * If called using for e.g http://localhost:8080/spring/map/hello/jello then usingMap method will execute
     *
     * i.e. if request is made with single path variable then pathVariable will execute
     *      if request is made with two path variable then multiplePathVariable will execute
     */

    @RequestMapping("/{pathvariable}")
    ModelAndView pathVariable(@PathVariable("pathvariable") String variable){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("welcomeMsg","Welcome1 : "+variable);
        return modelAndView;
    }

    @RequestMapping("/{variable1}/{variable2}")
    ModelAndView multiplePathVariable(@PathVariable("variable1") String variable1,@PathVariable("variable2") String variable2){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("welcomeMsg","Welcome2: "+variable1+" : "+variable2);
        return modelAndView;
    }

    /**
     * Here we can store the path variable in map and get back using map.get() method
     *
     */
    @RequestMapping("/map/{variable1}/{variable2}")
    ModelAndView usingMap(@PathVariable Map<String,String> map){
        String v1=map.get("variable1");
        String v2=map.get("variable2");

        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("welcomeMsg","Welcome map : "+v1+" : "+v2);
        return modelAndView;
    }

}
