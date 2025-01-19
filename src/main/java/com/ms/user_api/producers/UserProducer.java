package com.ms.user_api.producers;

import com.ms.user_api.dtos.EmailDto;
import com.ms.user_api.models.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Classe responsável por publicar mensagens relacionadas a e-mails no RabbitMQ.
 * Converte os dados do usuário em uma mensagem e publica na fila configurada.
 */
@Component
public class UserProducer {

    // Template do RabbitMQ para envio de mensagens
    final RabbitTemplate rabbitTemplate;

    /**
     * Construtor com injeção de dependência do RabbitTemplate.
     *
     * @param rabbitTemplate Instância do RabbitTemplate para envio de mensagens.
     */
    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    // Nome da fila ou chave de roteamento configurada no application.properties
    @Value(value = "${broker.queue.email.name}")
    private String routingKey;

    /**
     * Publica uma mensagem de e-mail na fila do RabbitMQ.
     * Converte os dados do usuário em um objeto EmailDto e envia a mensagem.
     *
     * @param user Objeto User contendo os dados necessários para o envio do e-mail.
     */
    public void publishMessageEmail(User user) {
        // Criação do DTO de e-mail com os dados do usuário
        var emailDto = new EmailDto();
        emailDto.setUserId(user.getId());
        emailDto.setEmailUser(user.getEmail());
        emailDto.setSubject("Seu cadastro foi realizado com sucesso!");
        emailDto.setMessage("Bem-vindo, " + user.getName() + "! \nSeu cadastro foi realizado com sucesso!");

        // Publica a mensagem no RabbitMQ utilizando a chave de roteamento configurada
        rabbitTemplate.convertAndSend("", routingKey, emailDto);
    }
}
