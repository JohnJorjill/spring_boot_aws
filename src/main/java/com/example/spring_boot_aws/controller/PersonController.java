package com.example.spring_boot_aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping
    public String getPerson(){
        return "Hello";
    }

}
