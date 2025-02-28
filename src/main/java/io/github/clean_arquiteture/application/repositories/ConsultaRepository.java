package io.github.clean_arquiteture.application.repositories;

import io.github.clean_arquiteture.infrastructure.persistence.entities.ConsultaEntity;

import java.util.Optional;

public interface ConsultaRepository {
    Optional<ConsultaEntity> findById(Long id);
    ConsultaEntity save(ConsultaEntity consulta);
}
