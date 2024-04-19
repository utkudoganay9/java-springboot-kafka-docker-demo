package com.kafkadockerdemo.java.kafka.docker.demo.controller;

import com.kafkadockerdemo.java.kafka.docker.demo.model.Message;
import com.kafkadockerdemo.java.kafka.docker.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {


    private Producer producer;

    @Autowired
    public Controller(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/send")
    public void sendMessageToKafkaTopic(@RequestBody Message message) {
        producer.sendMessage(message);
    }


    @GetMapping("/receive")
    public Message receiveMessageFromKafkaTopic() {

        Message message = new Message();

        return message;
    }
}
