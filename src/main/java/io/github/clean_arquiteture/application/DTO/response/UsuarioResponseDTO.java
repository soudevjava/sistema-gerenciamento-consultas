package io.github.clean_arquiteture.application.DTO.response;

import io.github.clean_arquiteture.domain.enumerator.PerfilEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioResponseDTO {
     private Long id;
     private String nome;
     private String email;
     private PerfilEnum perfil;
}
