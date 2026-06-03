package com.duvan.springboot.servicio;

import com.duvan.springboot.modelo.Usuario;
import java.util.List;

public interface IUsuarioServicio {
    List<Usuario> listarUsuarios();

    void guardar(Usuario user);

    void eliminar(Usuario user);

    Usuario buscar(Usuario user);
}

