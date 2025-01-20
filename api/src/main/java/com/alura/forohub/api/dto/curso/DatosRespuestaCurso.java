package com.alura.forohub.api.dto.curso;

import com.alura.forohub.api.model.Curso;

public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
