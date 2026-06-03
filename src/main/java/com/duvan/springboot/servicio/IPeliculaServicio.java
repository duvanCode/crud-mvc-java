package com.duvan.springboot.servicio;

import com.duvan.springboot.modelo.Pelicula;
import java.util.List;

public interface IPeliculaServicio {
    List<Pelicula> listarPeliculas();

    List<Pelicula> buscarPorQuery(String query);

    void guardar(Pelicula pelicula);

    void eliminar(Pelicula pelicula);

    Pelicula buscar(Pelicula pelicula);
}

