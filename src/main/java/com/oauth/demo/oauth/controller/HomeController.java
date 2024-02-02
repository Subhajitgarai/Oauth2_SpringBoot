package com.oauth.demo.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/oauth")
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello this is permitted for all !!";
    }
    @GetMapping("/secured")
    public String secured(){
        return "You are acessing private resources!!";
    }
}
