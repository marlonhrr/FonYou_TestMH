package com.fonyou.marlontest.domains.maestros;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Tb_Pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2000)
    private String enunciado;
    private Double puntaje;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "examen_id", referencedColumnName = "id")
    @JsonBackReference
    private Examen examen;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Respuesta> respuestas;

    public Pregunta() {
    }

    public Pregunta(Long id, String enunciado, Double puntaje, Examen examen, Set<Respuesta> respuestas) {
        this.id = id;
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.examen = examen;
        this.respuestas = respuestas;
    }

    public Long getId() {
        return id;
    }

    public Pregunta setId(Long id) {
        this.id = id;
        return this;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public Pregunta setEnunciado(String enunciado) {
        this.enunciado = enunciado;
        return this;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public Pregunta setPuntaje(Double porcentaje) {
        this.puntaje = porcentaje;
        return this;
    }

    public Examen getExamen() {
        return examen;
    }

    public Pregunta setExamen(Examen examen) {
        this.examen = examen;
        return this;
    }

    public Set<Respuesta> getRespuestas() {
        return respuestas;
    }

    public Pregunta setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
        return this;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "id=" + id +
                ", enunciado='" + enunciado + '\'' +
                ", porcentaje=" + puntaje +
                ", examen=" + examen +
                ", respuestas=" + respuestas +
                '}';
    }
}
