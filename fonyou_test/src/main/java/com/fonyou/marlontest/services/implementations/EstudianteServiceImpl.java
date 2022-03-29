package com.fonyou.marlontest.services.implementations;

import com.fonyou.marlontest.domains.maestros.Estudiante;
import com.fonyou.marlontest.repositories.EstudianteRepositorie;
import com.fonyou.marlontest.services.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {


    private EstudianteRepositorie estudianteRepositorie;

    public EstudianteServiceImpl(EstudianteRepositorie estudianteRepositorie) {
        this.estudianteRepositorie = estudianteRepositorie;
    }

    /**
     *
     * @param estudiante
     * @return
     */
    @Override
    public Estudiante createEstudiante(Estudiante estudiante) {
        return estudianteRepositorie.save(estudiante);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Estudiante> findAllEstudiantes() {
        return estudianteRepositorie.findAll();
    }
}
