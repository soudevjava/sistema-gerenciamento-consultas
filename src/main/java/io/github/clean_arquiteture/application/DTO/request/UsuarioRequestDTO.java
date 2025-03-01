package io.github.clean_arquiteture.application.DTO.request;

import io.github.clean_arquiteture.domain.enumerator.PerfilEnum;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioRequestDTO {
     private Long id;

     @NotBlank(message = "O nome do usuário é obrigatório")
     @Size(min = 2, max = 100, message = "O nome do usuário deve ter entre 2 e 100 caracteres")
     private String nome;

     @NotBlank(message = "O email é obrigatório")
     @Email(message = "O email deve estar em um formato válido")
     @Size(max = 100, message = "O email não pode ter mais de 100 caracteres")
     private String email;

     @NotBlank(message = "A senha é obrigatória")
     @Size(min = 8, max = 50, message = "A senha deve ter entre 8 e 50 caracteres")
     @Pattern(
             regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,50}$",
             message = "A senha deve conter pelo menos uma letra maiúscula, uma minúscula, um número e um caractere especial"
     )
     private String senha;

     @NotNull(message = "O perfil do usuário é obrigatório")
     private PerfilEnum perfil;
}
