package com.ms.user_api.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de configuração para o RabbitMQ.
 * Configura o conversor de mensagens para serializar e desserializar objetos no formato JSON.
 */
@Configuration
public class RabbitMqConfig {

    /**
     * Configura um conversor de mensagens para o RabbitMQ utilizando Jackson.
     * Permite que as mensagens enviadas e recebidas sejam convertidas para JSON automaticamente.
     *
     * @return Instância de Jackson2JsonMessageConverter configurada com ObjectMapper.
     */
    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        // Cria uma instância do ObjectMapper para personalizar a conversão de JSON, se necessário
        ObjectMapper objectMapper = new ObjectMapper();

        // Retorna o conversor configurado
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}

