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
 * Responsável por expor os endpoints da API
 */
@RestController
public class UserController {

    final UserService userService;

    // Injeção de dependência do UserService
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint para salvar um usuário.
     */
    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserDto UserDto) {
        var user = new User();
        BeanUtils.copyProperties(UserDto, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
}
