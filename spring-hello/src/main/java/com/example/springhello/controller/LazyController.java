package com.example.springhello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LazyController {

    @RequestMapping("/lazy")
    public String hello()
    {
        return "hello gaurav";
    }



}
