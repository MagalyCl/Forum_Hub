package com.clara.forum_hub.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioDto(

        @NotNull
        Long id,

        @NotBlank
        String nome,

        @NotBlank
        String email,

        @NotBlank
        String senha
) {
}
