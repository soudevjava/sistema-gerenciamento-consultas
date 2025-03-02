package io.github.clean_arquiteture.application.DTO.response;

import io.github.clean_arquiteture.domain.enumerator.StatusConsultaEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ConsultaResponseDTO {
     private Long id;
     private OffsetDateTime dataConsulta;
     private StatusConsultaEnum statusConsulta;
     private PacienteResponseDTO paciente;
     private MedicoResponseDTO medico;
}
