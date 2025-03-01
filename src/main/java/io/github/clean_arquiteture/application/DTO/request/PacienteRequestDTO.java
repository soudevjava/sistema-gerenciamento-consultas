package io.github.clean_arquiteture.application.DTO.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PacienteRequestDTO {
     private Long id;

     // O nome do paciente deve ser obrigatório e ter um tamanho mínimo/máximo
     @NotBlank(message = "O nome do paciente é obrigatório")
     @Size(min = 2, max = 100, message = "O nome do paciente deve ter entre 2 e 100 caracteres")
     private String nome;

     // O CPF deve ser obrigatório e seguir um formato específico
     @NotBlank(message = "O CPF do paciente é obrigatório")
     @Size(min = 11, max = 14, message = "O CPF deve ter entre 11 e 14 caracteres")
     @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11}", message = "O CPF deve estar no formato 123.456.789-00 ou 12345678900")
     private String cpf;

     // O endereço pode ser opcional, mas se presente, deve ter um tamanho mínimo/máximo
     @Size(max = 200, message = "O endereço não pode ter mais de 200 caracteres")
     private String endereco;

     // O telefone pode ser opcional, mas se presente, deve seguir um formato específico
     @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}|\\d{10,11}", message = "O telefone deve estar no formato (99) 99999-9999, (99) 9999-9999 ou 9999999999/99999999999")
     private String telefone;

     // A data de nascimento deve ser obrigatória e no passado ou presente
     @NotBlank(message = "A data de nascimento é obrigatória")
     @PastOrPresent(message = "A data de nascimento deve ser no passado ou hoje")
     private OffsetDateTime dataNascimento;

     // A lista de consultas pode ser opcional, mas se presente, cada consulta deve ser válida
     @Valid // Garante que cada ConsultaRequestDTO na lista seja validada
     private List<ConsultaRequestDTO> consultas;
}
