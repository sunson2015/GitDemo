package com.gitdemo.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private String getName(){
        return "name01";
    }
    private String getGrade(){
        return "8"
    }
}
