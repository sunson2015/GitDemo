package com.gitdemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class TestController {
    @GetMapping("/name")
    private String getName(){
        return "name01";
    }
    @GetMapping("/grade")
    private String getGrade(){
        return "8";
    }
}
