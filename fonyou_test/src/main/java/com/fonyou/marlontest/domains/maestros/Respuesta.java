package com.fonyou.marlontest.domains.maestros;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "Tb_Respuesta")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private Boolean correct;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pregunta_id", referencedColumnName = "id")
    @JsonBackReference
    private Pregunta pregunta;

    public Respuesta() {
    }

    public Respuesta(Long id, String contenido, Boolean correct, Pregunta pregunta) {
        this.id = id;
        this.contenido = contenido;
        this.correct = correct;
        this.pregunta = pregunta;
    }

    public Long getId() {
        return id;
    }

    public Respuesta setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContenido() {
        return contenido;
    }

    public Respuesta setContenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public Respuesta setCorrect(Boolean correct) {
        this.correct = correct;
        return this;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public Respuesta setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
        return this;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", correct=" + correct +
                ", pregunta=" + pregunta +
                '}';
    }
}
