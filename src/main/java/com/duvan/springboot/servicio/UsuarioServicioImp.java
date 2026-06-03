package com.duvan.springboot.servicio;

import com.duvan.springboot.dao.IUsuarioCrud;
import com.duvan.springboot.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicioImp implements IUsuarioServicio {
    @Autowired
    private IUsuarioCrud usuarioCrud;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarioCrud.findAll().forEach(usuarios::add);
        return usuarios;
    }

    @Override
    @Transactional
    public void guardar(Usuario user) {
        usuarioCrud.save(user);
    }

    @Override
    @Transactional
    public void eliminar(Usuario user) {
        usuarioCrud.deleteById(user.getCedula());
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario buscar(Usuario user) {
        return usuarioCrud.findById(user.getCedula()).orElse(null);
    }
}

