package io.github.clean_arquiteture.infrastructure.persistence.repositories;

import io.github.clean_arquiteture.application.repositories.UsuarioRepository;
import io.github.clean_arquiteture.infrastructure.persistence.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long>, UsuarioRepository {
}
