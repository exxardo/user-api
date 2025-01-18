package com.ms.user_api.producers;

import com.ms.user_api.dtos.EmailDto;
import com.ms.user_api.models.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Classe responsável por publicar mensagens de e-mail.
 */
@Component
public class UserProducer {
    final RabbitTemplate rabbitTemplate;

    // Injeção de dependência do RabbitTemplate
    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    // Injeção de dependência do valor da chave de roteamento
    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    // Método para publicar uma mensagem de e-mail
    public void publishMessageEmail(User user) {
        var emailDto = new EmailDto();
        emailDto.setUserId(user.getId());
        emailDto.setEmailUser(user.getEmail());
        emailDto.setSubject("Seu cadastro foi realizado com sucesso!");
        emailDto.setMessage(("Bem-vindo, " + user.getName() + "! \nSeu cadastro foi realizado com sucesso!"));

        // Publica a mensagem de e-mail com exchange vazia e chave de roteamento, sendo default.
        rabbitTemplate.convertAndSend("", routingKey, emailDto);
    }
}
