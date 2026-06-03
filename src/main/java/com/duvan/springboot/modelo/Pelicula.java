package com.duvan.springboot.modelo;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "titulo_original")
    private String tituloOriginal;

    @Column(name = "director")
    private String director;

    @Column(name = "genero")
    private String genero;

    @Column(name = "duracion_minutos")
    private Integer duracionMinutos;

    @Column(name = "fecha_estreno")
    private LocalDate fechaEstreno;

    @Column(name = "pais_origen")
    private String paisOrigen;

    @Column(name = "idioma_original")
    private String idiomaOriginal;

    @Column(name = "clasificacion_edad")
    private String clasificacionEdad;

    @Column(name = "productora")
    private String productora;

    @Column(name = "sinopsis", columnDefinition = "TEXT")
    private String sinopsis;
}

