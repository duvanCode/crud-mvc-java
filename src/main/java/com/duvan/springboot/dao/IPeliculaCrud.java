package com.duvan.springboot.dao;

import com.duvan.springboot.modelo.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface IPeliculaCrud extends CrudRepository<Pelicula, Long> {
    Iterable<Pelicula> findByNombreContainingIgnoreCaseOrTituloOriginalContainingIgnoreCase(
            String nombre,
            String tituloOriginal
    );
}

