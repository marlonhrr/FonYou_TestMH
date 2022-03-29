package com.fonyou.marlontest.domains.maestros;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Tb_Examen")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nombre;
    private Date fechaExamen;

    @OneToMany(mappedBy = "examen", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Pregunta> preguntas;

    public Examen() {
    }

    public Examen(Long id, String nombre, Date fechaExamen) {
        this.id = id;
        this.nombre = nombre;
        this.fechaExamen = fechaExamen;
    }

    public Long getId() {
        return id;
    }

    public Examen setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Examen setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Set<Pregunta> getPreguntas() {
        return preguntas;
    }

    public Examen setPreguntas(Set<Pregunta> preguntas) {
        this.preguntas = preguntas;
        return this;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public Examen setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
        return this;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", preguntas=" + preguntas +
                '}';
    }
}
