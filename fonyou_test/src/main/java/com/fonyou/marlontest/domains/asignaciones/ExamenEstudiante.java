package com.fonyou.marlontest.domains.asignaciones;

import javax.persistence.*;

@Entity
@Table(name = "Tb_ExamenEstudiante")
public class ExamenEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private Long examenId;
    private Long estudianteId;
    private Double calificacion = 0.0;

    public ExamenEstudiante(String codigo, Long examenId, Long estudianteId) {
        this.codigo = codigo;
        this.examenId = examenId;
        this.estudianteId = estudianteId;
    }

    public Long getId() {
        return id;
    }

    public ExamenEstudiante setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getExamenId() {
        return examenId;
    }

    public ExamenEstudiante setExamenId(Long examenId) {
        this.examenId = examenId;
        return this;
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public ExamenEstudiante setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public ExamenEstudiante setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public ExamenEstudiante setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
        return this;
    }

    @Override
    public String toString() {
        return "ExamenEstudiante{" +
                "id=" + id +
                ", examenId=" + examenId +
                ", estudianteId=" + estudianteId +
                '}';
    }
}
