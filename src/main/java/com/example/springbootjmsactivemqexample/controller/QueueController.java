package com.example.springbootjmsactivemqexample.controller;

import com.example.springbootjmsactivemqexample.dto.MessageDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @PostMapping
    public String sendMessage(@RequestBody MessageDTO messageDTO) {
        return messageDTO.toString();
    }

}
