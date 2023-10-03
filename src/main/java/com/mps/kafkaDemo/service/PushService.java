package com.mps.kafkaDemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class PushService {

    @Autowired
    private KafkaTemplate<String,String> template;

    public String push() {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int num = random.nextInt(100);
            template.send("firstTopic", String.valueOf(num));
        }
        return "success";
    }
}
