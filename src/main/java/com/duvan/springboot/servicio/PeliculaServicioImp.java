package com.duvan.springboot.servicio;

import com.duvan.springboot.dao.IPeliculaCrud;
import com.duvan.springboot.modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeliculaServicioImp implements IPeliculaServicio {
    @Autowired
    private IPeliculaCrud peliculaCrud;

    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> listarPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculaCrud.findAll().forEach(peliculas::add);
        return peliculas;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pelicula> buscarPorQuery(String query) {
        if (query == null || query.trim().isEmpty()) {
            return listarPeliculas();
        }
        List<Pelicula> peliculas = new ArrayList<>();
        peliculaCrud
                .findByNombreContainingIgnoreCaseOrTituloOriginalContainingIgnoreCase(query.trim(), query.trim())
                .forEach(peliculas::add);
        return peliculas;
    }

    @Override
    @Transactional
    public void guardar(Pelicula pelicula) {
        peliculaCrud.save(pelicula);
    }

    @Override
    @Transactional
    public void eliminar(Pelicula pelicula) {
        peliculaCrud.deleteById(pelicula.getId());
    }

    @Override
    @Transactional(readOnly = true)
    public Pelicula buscar(Pelicula pelicula) {
        return peliculaCrud.findById(pelicula.getId()).orElse(null);
    }
}

