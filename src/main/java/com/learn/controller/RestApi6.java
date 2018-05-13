package com.learn.controller;

import com.learn.model.Person;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi6 {

    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    public ResponseEntity<Person> restApi(){
        Person person=new Person();
        person.setFirstName("apollo");
        //Header value is optional
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.add("custom","test");
        return new ResponseEntity<Person>(person,httpHeaders,HttpStatus.OK);
    }
}
