package com.superior.usuariodepartamento.repository;

import com.superior.usuariodepartamento.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoy extends JpaRepository<Usuario, Long> {
}
