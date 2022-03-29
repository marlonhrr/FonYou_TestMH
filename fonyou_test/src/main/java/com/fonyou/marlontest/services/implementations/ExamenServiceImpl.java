package com.fonyou.marlontest.services.implementations;

import com.fonyou.marlontest.domains.maestros.Examen;
import com.fonyou.marlontest.domains.maestros.Respuesta;
import com.fonyou.marlontest.repositories.ExamenRepositorie;
import com.fonyou.marlontest.services.ExamenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenServiceImpl implements ExamenService {

    private ExamenRepositorie examenRepositorie;

    public ExamenServiceImpl(ExamenRepositorie examenRepositorie) {
        this.examenRepositorie = examenRepositorie;
    }

    /**
     * Servicio encargado de obtener todos los examenes
     *
     * @return Lista de examenes
     */
    @Override
    public List<Examen> getAllExamenes() {
        return examenRepositorie.findAll();
    }


    /**
     * Este método se encarga de crear un examen y validar que las condiciones del examen sean correctas
     *
     * @param examen
     * @return
     */
    @Override
    public Examen saveExamen(Examen examen) {
        //validación de preguntas
        if (examen.getPreguntas().size() != 4) {
            throw new IllegalArgumentException("El examen no tiene 4 preguntas!");
        }

        //Validación de que cada pregunta tenga una respuesta correcta.
        if(! examen.getPreguntas()
                .stream()
                .allMatch(pregunta ->
                        pregunta.getRespuestas()
                                .stream()
                                .filter(Respuesta::getCorrect).count() == 1)
        ){
            throw new IllegalArgumentException("Alguna de preguntas tiene más de una respuesta correcta!");
        }

        return examenRepositorie.save(examen);
    }
}
