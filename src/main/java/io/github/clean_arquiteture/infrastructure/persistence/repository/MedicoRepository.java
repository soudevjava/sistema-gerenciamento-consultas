package io.github.clean_arquiteture.infrastructure.persistence.repository;

import io.github.clean_arquiteture.infrastructure.persistence.entity.MedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {
}
