package com.superior.usuariodepartamento.Controle;

import com.superior.usuariodepartamento.entidade.Usuario;
import com.superior.usuariodepartamento.repository.UsuarioRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioControle {
    @Autowired
    private UsuarioRepositoy repository;

    @GetMapping
    public List<Usuario> findall() {
        List<Usuario> resultado = repository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        Usuario resultado = repository.findById(id).get();
        return resultado;

    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {
        Usuario resultado = repository.save(usuario);
        return resultado;
    }
}
