package com.fonyou.marlontest.domains.asignaciones;


import javax.persistence.*;

@Entity
@Table(name = "Tb_ExamenEstudiantePreguntas")
public class ExamenEstudiantePreguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long examenEstudianteId;
    private Long preguntaId;
    private Long respuestaId;

    public ExamenEstudiantePreguntas() {
    }

    public ExamenEstudiantePreguntas(Long examenEstudianteId, Long preguntaId, Long respuestaId) {
        this.examenEstudianteId = examenEstudianteId;
        this.preguntaId = preguntaId;
        this.respuestaId = respuestaId;
    }

    public Long getId() {
        return id;
    }

    public ExamenEstudiantePreguntas setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getExamenEstudianteId() {
        return examenEstudianteId;
    }

    public ExamenEstudiantePreguntas setExamenEstudianteId(Long examenEstudiante) {
        this.examenEstudianteId = examenEstudiante;
        return this;
    }

    public Long getPreguntaId() {
        return preguntaId;
    }

    public ExamenEstudiantePreguntas setPreguntaId(Long pregunta) {
        this.preguntaId = pregunta;
        return this;
    }

    public Long getRespuestaId() {
        return respuestaId;
    }

    public ExamenEstudiantePreguntas setRespuestaId(Long respuesta) {
        this.respuestaId = respuesta;
        return this;
    }
}
