package com.fonyou.marlontest.services.implementations;

import com.fonyou.marlontest.domains.asignaciones.ExamenEstudiante;
import com.fonyou.marlontest.domains.asignaciones.ExamenEstudiantePreguntas;
import com.fonyou.marlontest.domains.maestros.Pregunta;
import com.fonyou.marlontest.domains.maestros.Respuesta;
import com.fonyou.marlontest.repositories.ExamenEstudianteRepositorie;
import com.fonyou.marlontest.repositories.PreguntaRepositorie;
import com.fonyou.marlontest.services.ExamenEstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenEstudianteServiceImpl implements ExamenEstudianteService {

    private ExamenEstudianteRepositorie examenEstudianteRepositorie;
    private PreguntaRepositorie preguntaRepositorie;

    public ExamenEstudianteServiceImpl(ExamenEstudianteRepositorie examenEstudianteRepositorie,
                                       PreguntaRepositorie preguntaRepositorie) {
        this.examenEstudianteRepositorie = examenEstudianteRepositorie;
        this.preguntaRepositorie = preguntaRepositorie;
    }

    /**
     * Método para asignar examen a un estudiante.
     * @param examenEstudiante
     * @return
     */
    @Override
    public ExamenEstudiante assignExamenToEstudiante(ExamenEstudiante examenEstudiante) {
        return examenEstudianteRepositorie.save(
                examenEstudiante.setCodigo("Examen_" + examenEstudiante.getExamenId() + "_" + examenEstudiante.getEstudianteId())
        );
    }

    /**
     * Método encargado de calificar el examen del estudiante.
     * @param examenEstudiantePreguntasList
     * @param examenEstudianteId
     * @return
     */
    @Override
    public ExamenEstudiante answerExamen(Long examenEstudianteId, List<ExamenEstudiantePreguntas> examenEstudiantePreguntasList) {

        //Encuentro el objeto que contiene la relación del estudiante con el examen
        Optional<ExamenEstudiante> examenEstudiante = examenEstudianteRepositorie.findById(examenEstudianteId);
        //Si la relación exite, sigo calificando
        if(examenEstudiante.isPresent()){
            return examenEstudianteRepositorie.save(
                    examenEstudiante.get().setCalificacion(
                            examenEstudiantePreguntasList.stream().mapToDouble(respuestaPregunta -> {
                                Pregunta preguntaAux = preguntaRepositorie.getById(respuestaPregunta.getPreguntaId());
                                Respuesta respuestaAux = preguntaAux.getRespuestas()
                                        .stream()
                                        .filter(respuesta -> respuesta.getId().equals(respuestaPregunta.getRespuestaId()))
                                        .findFirst()
                                        .get();
                                return respuestaAux.getCorrect() ? preguntaAux.getPuntaje() : 0;
                            }).sum()
                    )
            );
        } else {
            throw new IllegalArgumentException("El examen que intenta calificar no ha sido asignado a ningun estudiante!");
        }
    }
}
