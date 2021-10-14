package com.example.springbootjmsactivemqexample.controller;

import com.example.springbootjmsactivemqexample.dto.MessageDTO;
import com.example.springbootjmsactivemqexample.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-message")
@Slf4j
public class MessageController {

    @Autowired
    private MessageService queueService;

    @PostMapping("/queue")
    public String sendMessageToQueue(@RequestBody MessageDTO messageDTO) {
        log.info("--------- Starting send Message to queue at the Controller ----------");
        queueService.sendMessageToQueue(messageDTO);
        log.info("--------- Finishing send Message to queue at the Controller ----------");
        return "Message sent to queue";
    }

    @PostMapping("/topic")
    public String sendMessageToTopic(@RequestBody MessageDTO messageDTO) {
        log.info("--------- Starting send Message to topic at the Controller ----------");
        queueService.sendMessageToTopic(messageDTO);
        log.info("--------- Finishing send Message to topic at the Controller ----------");
        return "Message sent to topic";
    }

}
