package com.ms.user_api.dtos;

import java.util.UUID;

/**
 * DTO (Data Transfer Object) que representa os dados de um e-mail.
 * Contém as informações necessárias para o envio de um e-mail, como ID do usuário, endereço de e-mail, assunto e mensagem.
 */
public class EmailDto {

    // Identificador único do usuário associado ao e-mail
    private UUID userId;

    // Endereço de e-mail do destinatário
    private String emailUser;

    // Assunto do e-mail
    private String subject;

    // Mensagem do e-mail
    private String message;

    /**
     * Obtém o identificador único do usuário.
     *
     * @return UUID do usuário.
     */
    public UUID getUserId() {
        return userId;
    }

    /**
     * Define o identificador único do usuário.
     *
     * @param userId UUID a ser atribuído ao usuário.
     */
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     * Obtém o endereço de e-mail do destinatário.
     *
     * @return Endereço de e-mail.
     */
    public String getEmailUser() {
        return emailUser;
    }

    /**
     * Define o endereço de e-mail do destinatário.
     *
     * @param emailUser Endereço de e-mail a ser atribuído.
     */
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * Obtém o assunto do e-mail.
     *
     * @return Assunto do e-mail.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Define o assunto do e-mail.
     *
     * @param subject Assunto a ser atribuído ao e-mail.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Obtém a mensagem do e-mail.
     *
     * @return Mensagem do e-mail.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define a mensagem do e-mail.
     *
     * @param message Mensagem a ser atribuída ao e-mail.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
