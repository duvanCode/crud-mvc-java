package com.duvan.springboot.dao;

import com.duvan.springboot.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioCrud extends CrudRepository<Usuario, Long> {
}

