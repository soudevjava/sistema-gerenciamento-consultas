package io.github.clean_arquiteture.infrastructure.persistence.repositories;

import io.github.clean_arquiteture.application.repositories.MedicoRepository;
import io.github.clean_arquiteture.infrastructure.persistence.entities.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoJpaRepository extends JpaRepository<MedicoEntity, Long>, MedicoRepository {
}
