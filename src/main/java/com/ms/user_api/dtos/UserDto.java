package com.ms.user_api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * DTO (Data Transfer Object) que representa os dados necessários para criar ou atualizar um usuário.
 * Contém as informações básicas de um usuário, como nome e email, com validações aplicadas.
 */
public record UserDto(@NotBlank String name, @NotBlank @Email String email) {
}
