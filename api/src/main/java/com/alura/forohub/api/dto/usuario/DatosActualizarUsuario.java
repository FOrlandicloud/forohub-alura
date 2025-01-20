package com.alura.forohub.api.dto.usuario;

import com.alura.forohub.api.model.Tipo;

public record DatosActualizarUsuario(
        Long id,
        String nombre,
        String email,
        String contrasena,
        Tipo tipo
) {
}
