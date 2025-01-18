package com.ms.user_api.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Value("${broker.queue.email.name}")
    private String queueEmail;

    @Bean
    public Queue queueEmail() {
        return new Queue(queueEmail, true);
    }
}
