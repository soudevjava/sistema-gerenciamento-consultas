package io.github.clean_arquiteture.application.DTO.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PacienteResponseDTO {
     private Long id;
     private String nome;
     private String endereco;
     private String telefone;
     private OffsetDateTime dataNascimento;
     private List<ConsultaResponseDTO> consultas;
}
