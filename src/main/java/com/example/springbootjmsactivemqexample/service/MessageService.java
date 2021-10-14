package com.example.springbootjmsactivemqexample.service;

import com.example.springbootjmsactivemqexample.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {

//    Bean created at JmsConfig class
    @Autowired
    private JmsTemplate jmsTemplateQueue;

    //    Bean created at JmsConfig class
    @Autowired
    private JmsTemplate jmsTemplateTopic;

    public void sendMessageToQueue(MessageDTO messageDTO) {
        log.info("--------- Starting send Message to queue at the Service ----------");
        var message = messageDTO.toString();
        jmsTemplateQueue.convertAndSend("queue.sample", message);
        log.info("--------- finishing send Message to queue at the Service ----------");
    }

    public void sendMessageToTopic(MessageDTO messageDTO) {
        log.info("--------- Starting send Message to topic at the Service ----------");
        var message = messageDTO.toString();
        jmsTemplateTopic.convertAndSend("topic.sample", message);
        log.info("--------- finishing send Message to topic at the Service ----------");
    }

}
