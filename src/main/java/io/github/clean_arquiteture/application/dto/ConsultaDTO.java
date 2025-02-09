package io.github.clean_arquiteture.application.dto;

import io.github.clean_arquiteture.domain.enums.StatusConsulta;

public record ConsultaDTO(Long consultaId, String dataConsulta,
                          StatusConsulta statusConsulta, Long pacienteId,
                          Long medicoId) {
}
