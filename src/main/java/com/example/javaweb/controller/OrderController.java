package com.example.javaweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orderInfo")
public class OrderController {

    @PostMapping("/add")
    public String add(){
        return "add";
    }
}
