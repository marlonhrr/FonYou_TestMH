package com.fonyou.marlontest.domains.maestros;


import javax.persistence.*;

@Entity
@Table(name = "Tb_Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String nombre;

    private int edad;

    @Column(length = 50)
    private String ciudad;

    @Column(length = 30)
    private String zonaHoraria;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, int edad, String ciudad, String zonaHoraria) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.zonaHoraria = zonaHoraria;
    }

    public Long getId() {
        return id;
    }

    public Estudiante setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Estudiante setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Estudiante setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public Estudiante setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
        return this;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                ", zonaHoraria='" + zonaHoraria + '\'' +
                '}';
    }
}
