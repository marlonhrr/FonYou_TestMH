package com.fonyou.marlontest.services.implementations;

import com.fonyou.marlontest.domains.maestros.Pregunta;
import com.fonyou.marlontest.domains.maestros.Respuesta;
import com.fonyou.marlontest.repositories.PreguntaRepositorie;
import com.fonyou.marlontest.services.PreguntaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    private PreguntaRepositorie preguntaRepositorie;

    public PreguntaServiceImpl(PreguntaRepositorie preguntaRepositorie) {
        this.preguntaRepositorie = preguntaRepositorie;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Pregunta> getAllPreguntas() {
        return preguntaRepositorie.findAll();
    }

    @Override
    public Long getCorrectRespuesta(Long id) {
        Pregunta pregunta = preguntaRepositorie.findById(id).get();
        for (Respuesta respuesta : pregunta.getRespuestas()) {
            if(respuesta.getCorrect()){
                return pregunta.getId();
            }
        }
        return -1L;
    }


}
