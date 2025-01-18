package com.ms.user_api.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    // Nome da fila de email
    @Value("${broker.queue.email.name}")
    private String queueEmail;

    // Criação da fila de email
    @Bean
    public Queue queueEmail() {
        return new Queue(queueEmail, true);
    }
}
