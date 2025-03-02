package io.github.clean_arquiteture.application.DTO.request;

import io.github.clean_arquiteture.domain.enumerator.StatusConsultaEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ConsultaRequestDTO {

     private Long id;

     @NotNull(message = "A data da consulta é obrigatória")
     @Future(message = "A data da consulta deve estar no futuro")
     private OffsetDateTime dataConsulta;

     @NotNull(message = "O status da consulta é obrigatório")
     private StatusConsultaEnum statusConsulta;

     @NotNull(message = "Os dados do paciente são obrigatórios")
     @Valid // Valida os campos dentro de PacienteRequestDTO
     private PacienteRequestDTO paciente;

     @NotNull(message = "Os dados do médico são obrigatórios")
     @Valid // Valida os campos dentro de MedicoRequestDTO
     private MedicoRequestDTO medico;
}
