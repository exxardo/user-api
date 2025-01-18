package com.ms.user_api.services;

import com.ms.user_api.models.User;
import com.ms.user_api.producers.UserProducer;
import com.ms.user_api.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    final
    UserRepository userRepository;
    UserProducer userProducer;

    // Injeção de dependência do UserRepository
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Método para salvar um usuário
    @Transactional
    public User save(User user) {
        user = userRepository.save(user);
        userProducer.publishMessageEmail(user);
        return user;
    }
}
