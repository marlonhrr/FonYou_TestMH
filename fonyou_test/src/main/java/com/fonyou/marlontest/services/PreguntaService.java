package com.fonyou.marlontest.services;

import com.fonyou.marlontest.domains.maestros.Pregunta;

import java.util.List;

public interface PreguntaService {
    List<Pregunta> getAllPreguntas();
    Long getCorrectRespuesta(Long id);
}
