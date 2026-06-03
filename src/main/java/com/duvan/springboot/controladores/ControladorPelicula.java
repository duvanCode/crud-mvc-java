package com.duvan.springboot.controladores;

import com.duvan.springboot.modelo.Pelicula;
import com.duvan.springboot.servicio.IPeliculaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPelicula {
    @Autowired
    private IPeliculaServicio peliculaServicio;

    @GetMapping("/peliculas")
    public String listar(@RequestParam(name = "query", required = false) String query, Model modelo) {
        List<Pelicula> peliculas = peliculaServicio.buscarPorQuery(query);
        modelo.addAttribute("peliculas", peliculas);
        modelo.addAttribute("query", query);
        return "peliculas/index";
    }

    @GetMapping("/peliculas/agregar")
    public String agregar(Model modelo) {
        modelo.addAttribute("pelicula", new Pelicula());
        return "peliculas/form";
    }

    @PostMapping("/peliculas/guardar")
    public String guardar(Pelicula pelicula) {
        peliculaServicio.guardar(pelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/peliculas/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model modelo) {
        Pelicula pelicula = new Pelicula();
        pelicula.setId(id);
        pelicula = peliculaServicio.buscar(pelicula);
        modelo.addAttribute("pelicula", pelicula);
        return "peliculas/form";
    }

    @GetMapping("/peliculas/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        Pelicula pelicula = new Pelicula();
        pelicula.setId(id);
        peliculaServicio.eliminar(pelicula);
        return "redirect:/peliculas";
    }
}

