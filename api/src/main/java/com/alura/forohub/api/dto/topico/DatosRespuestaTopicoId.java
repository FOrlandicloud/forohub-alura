package com.alura.forohub.api.dto.topico;

import com.alura.forohub.api.dto.curso.DatosRespuestaCurso;
import com.alura.forohub.api.dto.usuario.DatosRespuestaUsuario;
import com.alura.forohub.api.model.Topico;

public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
