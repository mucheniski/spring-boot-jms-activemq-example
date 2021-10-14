package com.example.springbootjmsactivemqexample.controller;

import com.example.springbootjmsactivemqexample.dto.MessageDTO;
import com.example.springbootjmsactivemqexample.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Messages")
@RestController
@RequestMapping("/send-message")
@Slf4j
public class MessageController {

    @Autowired
    private MessageService queueService;

    @ApiOperation("Send a message to a Queue")
    @PostMapping("/queue")
    public String sendMessageToQueue(
            @ApiParam(name = "body", value = "Subject and Body of a message")
            @RequestBody MessageDTO messageDTO
    ) {
        log.info("--------- Starting send Message to queue at the Controller ----------");
        queueService.sendMessageToQueue(messageDTO);
        log.info("--------- Finishing send Message to queue at the Controller ----------");
        return "Message sent to queue";
    }

    @ApiOperation("Send a message to a Topic")
    @PostMapping("/topic")
    public String sendMessageToTopic(
            @ApiParam(name = "body", value = "Subject and Body of a message")
            @RequestBody MessageDTO messageDTO
    ) {
        log.info("--------- Starting send Message to topic at the Controller ----------");
        queueService.sendMessageToTopic(messageDTO);
        log.info("--------- Finishing send Message to topic at the Controller ----------");
        return "Message sent to topic";
    }

}
