package com.alura.forohub.api.dto.respuesta;

import com.alura.forohub.api.model.Respuesta;

public record DatosListadoRespuesta(Long id, String mensaje, String topico, String autor) {
    public DatosListadoRespuesta(Respuesta respuesta) {
        this(respuesta.getId(), respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
