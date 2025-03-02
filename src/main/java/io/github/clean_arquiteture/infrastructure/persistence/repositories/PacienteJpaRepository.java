package io.github.clean_arquiteture.infrastructure.persistence.repositories;

import io.github.clean_arquiteture.application.repositories.PacienteRepository;
import io.github.clean_arquiteture.infrastructure.persistence.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteJpaRepository extends JpaRepository<PacienteEntity, Long>, PacienteRepository {
}
