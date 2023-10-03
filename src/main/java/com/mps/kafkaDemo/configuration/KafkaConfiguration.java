package com.mps.kafkaDemo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic createTopic(){
        return new NewTopic("firstTopic", 4, (short) 1);
    }
}
