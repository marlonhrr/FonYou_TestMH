package com.fonyou.marlontest.services;

import com.fonyou.marlontest.domains.asignaciones.ExamenEstudiante;
import com.fonyou.marlontest.domains.asignaciones.ExamenEstudiantePreguntas;

import java.util.List;

public interface ExamenEstudianteService {

    ExamenEstudiante assignExamenToEstudiante(ExamenEstudiante examenEstudiante);
    ExamenEstudiante answerExamen(Long examenEstudianteId, List<ExamenEstudiantePreguntas> examenEstudiantePreguntasList);
}
