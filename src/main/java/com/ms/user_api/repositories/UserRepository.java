package com.ms.user_api.repositories;

import com.ms.user_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

/**
 * Repositório responsável por realizar operações de persistência para a entidade User.
 * Extende JpaRepository para fornecer métodos prontos para operações de CRUD e consultas personalizadas.
 */
public interface UserRepository extends JpaRepository<User, UUID> {

}
