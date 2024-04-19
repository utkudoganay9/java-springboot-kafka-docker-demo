package com.kafkadockerdemo.java.kafka.docker.demo.service;

import com.kafkadockerdemo.java.kafka.docker.demo.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "message-topic", groupId = "message_group_id")
    public void listen(Message message) {

        System.out.println("Recieved message: " + message.toString());
    }
}
