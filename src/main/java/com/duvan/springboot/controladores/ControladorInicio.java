package com.duvan.springboot.controladores;

import com.duvan.springboot.modelo.Usuario;
import com.duvan.springboot.servicio.IUsuarioServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    private IUsuarioServicio userServicio;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Usuario> listaUsuarios = userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuarios);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        userServicio.guardar(usuario);
        return "redirect:/";
    }

    @GetMapping("/editar/{cedula}")
    public String editar(@PathVariable("cedula") Long cedula, Model modelo) {
        Usuario usuario = new Usuario();
        usuario.setCedula(cedula);
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario", usuario);
        return "modificar";
    }

    @GetMapping("/eliminar/{cedula}")
    public String eliminar(@PathVariable("cedula") Long cedula) {
        Usuario usuario = new Usuario();
        usuario.setCedula(cedula);
        userServicio.eliminar(usuario);
        return "redirect:/";
    }
}

