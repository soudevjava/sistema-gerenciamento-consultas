package io.github.clean_arquiteture.application.repositories;

import io.github.clean_arquiteture.infrastructure.persistence.entities.PacienteEntity;

import java.util.Optional;

public interface PacienteRepository {
    Optional<PacienteEntity> findById(Long id);
    PacienteEntity save(PacienteEntity paciente);
}
