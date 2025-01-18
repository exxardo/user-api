package com.ms.user_api.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.ms.user_api.dtos.EmailDto;

/**
 * Classe para consumir a fila de email
 */
@Component
public class EmailConsumer {

    // Método para ouvir a fila de email
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDto emailDto) {
        System.out.println(emailDto.emailUser());
    }
}
