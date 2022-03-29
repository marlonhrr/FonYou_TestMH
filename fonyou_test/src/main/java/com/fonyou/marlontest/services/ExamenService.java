package com.fonyou.marlontest.services;

import com.fonyou.marlontest.domains.maestros.Examen;

import java.util.List;

public interface ExamenService {

    List<Examen> getAllExamenes();
    Examen saveExamen(Examen examen);
}
