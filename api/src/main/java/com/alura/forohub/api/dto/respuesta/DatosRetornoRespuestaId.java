package com.alura.forohub.api.dto.respuesta;

import com.alura.forohub.api.dto.topico.DatosRespuestaTopico;
import com.alura.forohub.api.dto.usuario.DatosRespuestaUsuario;
import com.alura.forohub.api.model.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
