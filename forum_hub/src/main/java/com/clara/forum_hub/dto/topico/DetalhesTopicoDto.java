package com.clara.forum_hub.dto.topico;

import com.clara.forum_hub.models.entities.Topico;
import com.clara.forum_hub.models.status.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record DetalhesTopicoDto(

        Long id,
        String titulo,
        String mensagem,
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime dataCriacao,
        Status status,
        String autor,
        String curso
) {

    public DetalhesTopicoDto(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                topico.getAutor().getNome(),
                topico.getCurso()
        );
    }
}
