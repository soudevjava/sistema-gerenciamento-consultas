package io.github.clean_arquiteture.application.repositories;

import io.github.clean_arquiteture.infrastructure.persistence.entities.UsuarioEntity;

import java.util.Optional;

public interface UsuarioRepository{
    Optional<UsuarioEntity> findById(Long id);
    UsuarioEntity save(UsuarioEntity usuario);
}
