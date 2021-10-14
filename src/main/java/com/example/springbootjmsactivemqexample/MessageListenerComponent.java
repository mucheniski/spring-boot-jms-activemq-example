package com.example.springbootjmsactivemqexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageListenerComponent {

    @JmsListener(destination = "queue.sample")
    public void onReceiverQueue(String message) {
        log.info("--------- listen Message at the Queue Listener ---------- " + message);
    }

    @JmsListener(destination = "topic.sample", containerFactory = "jmsFactoryTopic")
    public void onReceiverTopic(String message) {
        log.info("--------- listen Message at the Topic Listener ---------- " + message);
    }

}
