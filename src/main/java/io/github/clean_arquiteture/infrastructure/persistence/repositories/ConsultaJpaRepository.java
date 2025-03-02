package io.github.clean_arquiteture.infrastructure.persistence.repositories;

import io.github.clean_arquiteture.application.repositories.ConsultaRepository;
import io.github.clean_arquiteture.infrastructure.persistence.entities.ConsultaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaJpaRepository extends JpaRepository<ConsultaEntity, Long>, ConsultaRepository {
}
