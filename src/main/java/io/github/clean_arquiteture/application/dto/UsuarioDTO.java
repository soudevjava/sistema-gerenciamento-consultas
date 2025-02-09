package io.github.clean_arquiteture.application.dto;

public record UsuarioDTO(Long usuarioId, String nomeUsuario,
                         String email, String senha,
                         String perfil) {
}
