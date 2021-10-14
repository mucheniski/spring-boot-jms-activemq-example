package com.example.springbootjmsactivemqexample.controller;

import com.example.springbootjmsactivemqexample.dto.MessageDTO;
import com.example.springbootjmsactivemqexample.service.QueueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
@Slf4j
public class QueueController {

    @Autowired
    private QueueService queueService;

    @PostMapping
    public String sendMessage(@RequestBody MessageDTO messageDTO) {
        log.info("--------- Starting sendMessage at the Controller ----------");
        var message = queueService.sendMessage(messageDTO);
        log.info("--------- Finishing sendMessage at the Controller ----------");
        return message;
    }

}
