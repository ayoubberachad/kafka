package com.ber.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "topicA1", groupId = "A")
    void listener(String data) {
    System.out.println("Data received : " +data);

    }
}
