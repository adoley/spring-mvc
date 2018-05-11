package com.learn.controller;

import com.learn.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class GetPostAndModelAttribute3 {

    /**
     *Return login.jsp page where user can enter details
     *
     */
    @RequestMapping(value="/login" ,method = RequestMethod.GET)
    ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView("login");
        return modelAndView;
    }

    /**
     * Get the value that user have entered from the login page as @RequestParam
     * and display the user details in generalView.jsp page
     */
    @RequestMapping(value="/submit" ,method = RequestMethod.POST)
    ModelAndView submit(@RequestParam Map<String,String> req){
        ModelAndView modelAndView=new ModelAndView("generalView");
        modelAndView.addObject("msg","first name : "+req.get("firstName") +" Last name : "+req.get("lastName"));
        return modelAndView;
    }

    @RequestMapping(value="/login/model" ,method = RequestMethod.GET)
    ModelAndView loginModel(){
        ModelAndView modelAndView=new ModelAndView("loginModel");
        return modelAndView;
    }
    /**
     * Lets extend the above /submit to use model Person
     */
    @RequestMapping(value="/submit/model" ,method = RequestMethod.POST)
    ModelAndView submitModel(@RequestParam Map<String,String> req){
        Person person=new Person();
        person.setFirstName(req.get("firstName"));
        person.setLastName(req.get("lastName"));

        ModelAndView modelAndView=new ModelAndView("personModel");
        modelAndView.addObject("individual",person);
        modelAndView.addObject("msg","api: /submit/model");
        return modelAndView;
    }

    /**
     * Lets extend above example using model attribute. All these examples does the same thing
     */
    @RequestMapping(value="/login/model/attribute" ,method = RequestMethod.GET)
    ModelAndView loginModelAttribute(){
        ModelAndView modelAndView=new ModelAndView("loginModelAttribute");
        return modelAndView;
    }
    /**
     * Lets extend the above /submit to use @ModelAttribute annotation.
     * Here the variable name in jsp/html must match the variable name in Person class
     */
    @RequestMapping(value="/submit/model/attribute" ,method = RequestMethod.POST)
    ModelAndView submitModelAttribute(@ModelAttribute("individual") Person person){

        ModelAndView modelAndView=new ModelAndView("personModel");
        modelAndView.addObject("msg","api : /submit/model/attribute");
        return modelAndView;
    }
}
