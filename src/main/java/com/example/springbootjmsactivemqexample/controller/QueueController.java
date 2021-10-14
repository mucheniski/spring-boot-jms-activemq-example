package com.example.springbootjmsactivemqexample.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @PostMapping
    public String sendMessage() {
        return "It's ok";
    }

}
