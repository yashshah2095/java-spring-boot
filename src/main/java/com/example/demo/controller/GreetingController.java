package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    @Autowired
    Greeting greeting;
    AtomicLong counter=new AtomicLong();
    @GetMapping("/greeting")
    public Greeting hello(@RequestParam(value = "name")String name){
        greeting.setName("Hello From "+name);
        greeting.setId(counter);
        return greeting;
    }
}
