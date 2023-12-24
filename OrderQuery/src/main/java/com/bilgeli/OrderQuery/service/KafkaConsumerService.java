package com.bilgeli.OrderQuery.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = {"order-management.order-management.orders"}, groupId = "my_connector_group")
    public void listen(String event) {
        System.out.println("Received message from 'order' topic: " + event);
    }
}
