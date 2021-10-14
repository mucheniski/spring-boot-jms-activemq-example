package com.example.springbootjmsactivemqexample.service;

import com.example.springbootjmsactivemqexample.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QueueService {

    @Autowired
    private JmsTemplate jmsTemplateQueue;

    public MessageDTO sendMessage(MessageDTO messageDTO) {
        log.info("--------- Starting sendMessage at the Controller ----------");
        jmsTemplateQueue.convertAndSend("queue.sample", messageDTO.toString());
        log.info("--------- finishing sendMessage at the Controller ----------");
        return messageDTO;

    }

}
