package com.kafkadockerdemo.java.kafka.docker.demo.service;

import com.kafkadockerdemo.java.kafka.docker.demo.model.Message;
import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC = "message-topic";

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
