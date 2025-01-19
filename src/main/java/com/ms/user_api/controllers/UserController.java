package com.ms.user_api.controllers;

import com.ms.user_api.dtos.UserDto;
import com.ms.user_api.models.User;
import com.ms.user_api.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador responsável por expor os endpoints da API relacionados à entidade User.
 * Gerencia as requisições HTTP e delega a lógica de negócio para o serviço correspondente.
 */
@RestController
public class UserController {

    // Serviço responsável pelas operações relacionadas a usuários
    final UserService userService;

    /**
     * Construtor do controlador com injeção de dependência do UserService.
     *
     * @param userService Instância do serviço de usuários.
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint para salvar um novo usuário.
     * Recebe os dados do usuário, realiza validações e delega a persistência ao serviço.
     *
     * @param userDto Objeto contendo os dados do usuário a serem salvos.
     * @return ResponseEntity contendo o usuário salvo e o status HTTP 201 (Created).
     */
    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserDto userDto) {
        // Criação de uma nova instância de User e cópia das propriedades do DTO
        var user = new User();
        BeanUtils.copyProperties(userDto, user);

        // Salva o usuário utilizando o serviço e retorna a resposta
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
}
