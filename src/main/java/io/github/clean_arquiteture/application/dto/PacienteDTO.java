package io.github.clean_arquiteture.application.dto;

import java.util.Date;

public record PacienteDTO(Long pacienteId, String nomePaciente,
                          String cpf, String endereco,
                          String telefone,Date dataNascimento) {
}
