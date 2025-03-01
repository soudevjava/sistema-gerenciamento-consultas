package io.github.clean_arquiteture.application.DTO.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MedicoResponseDTO {
     private Long id;
     private String nome;
     private String crm;
     private List<ConsultaResponseDTO> consultas;
}
