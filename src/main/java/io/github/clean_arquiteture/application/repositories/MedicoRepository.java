package io.github.clean_arquiteture.application.repositories;

import io.github.clean_arquiteture.infrastructure.persistence.entities.MedicoEntity;

import java.util.Optional;

public interface MedicoRepository {
    Optional<MedicoEntity> findById(Long id);
    MedicoEntity save(MedicoEntity medico);
}
