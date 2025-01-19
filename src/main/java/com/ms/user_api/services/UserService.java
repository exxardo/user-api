package com.ms.user_api.services;

import com.ms.user_api.models.User;
import com.ms.user_api.producers.UserProducer;
import com.ms.user_api.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 * Serviço responsável por gerenciar as operações relacionadas à entidade User.
 * Realiza a lógica de negócio e interage com o repositório e o produtor de mensagens.
 */
@Service
public class UserService {

    // Repositório para operações de persistência da entidade User
    private final UserRepository userRepository;

    // Produtor de mensagens para publicar eventos relacionados ao usuário
    private final UserProducer userProducer;

    /**
     * Construtor do serviço com injeção de dependência do UserRepository e UserProducer.
     *
     * @param userRepository Repositório para manipulação de dados do usuário.
     * @param userProducer Produtor responsável por publicar mensagens relacionadas ao usuário.
     */
    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

    /**
     * Salva um usuário no banco de dados e publica uma mensagem de e-mail.
     *
     * @param user Objeto User a ser salvo.
     * @return O usuário salvo.
     */
    @Transactional
    public User save(User user) {
        // Salva o usuário no banco de dados
        user = userRepository.save(user);

        // Publica uma mensagem para notificar sobre o cadastro do usuário
        userProducer.publishMessageEmail(user);

        // Retorna o usuário salvo
        return user;
    }
}

