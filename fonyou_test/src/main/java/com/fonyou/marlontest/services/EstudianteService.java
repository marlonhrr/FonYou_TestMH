package com.fonyou.marlontest.services;

import com.fonyou.marlontest.domains.maestros.Estudiante;

import java.util.List;

public interface EstudianteService {

    Estudiante createEstudiante(Estudiante estudiante);

    List<Estudiante> findAllEstudiantes();
}
