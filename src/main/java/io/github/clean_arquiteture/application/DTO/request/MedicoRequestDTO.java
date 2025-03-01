package io.github.clean_arquiteture.application.DTO.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MedicoRequestDTO {

     private Long id;

     @NotBlank(message = "O nome do médico é obrigatório")
     @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
     private String nome;

     @NotBlank(message = "O CRM é obrigatório")
     @Pattern(regexp = "\\d{4,6}-[A-Z]{2}", message = "O CRM deve seguir o formato correto (ex: 123456-SP)")
     private String crm;

     @Valid // Garante a validação das consultas associadas
     private List<ConsultaRequestDTO> consultas;
}
