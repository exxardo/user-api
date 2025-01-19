package com.ms.user_api.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Classe que representa um usuário no sistema.
 * Contém as informações básicas de um usuário, como ID, nome e email.
 */
@Entity
@Table(name = "tb_users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    // Identificador único do usuário, gerado automaticamente
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID id;
    private String name;
    private String email;

    /**
     * Obtém o identificador único do usuário.
     *
     * @return UUID do usuário.
     */
    public UUID getId() {
        return id;
    }

    /**
     * Define o identificador único do usuário.
     *
     * @param id UUID a ser atribuído ao usuário.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Obtém o nome do usuário.
     *
     * @return Nome do usuário.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome do usuário.
     *
     * @param name Nome a ser atribuído ao usuário.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém o email do usuário.
     *
     * @return Email do usuário.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do usuário.
     *
     * @param email Email a ser atribuído ao usuário.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}