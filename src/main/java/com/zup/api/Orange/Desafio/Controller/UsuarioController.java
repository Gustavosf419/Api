package com.zup.api.Orange.Desafio.Controller;

import com.zup.api.Orange.Desafio.Model.Usuario;
import com.zup.api.Orange.Desafio.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
    @RequestMapping("/usuarios")
    public class UsuarioController {

        @Autowired
        private UsuarioRepository usuarioRepository;

        @GetMapping("/{id}")
        public Optional<Usuario> getUsuarioById(@PathVariable("id") Integer id) {
            return usuarioRepository.findById(id);
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Usuario salvarUsuario(@RequestBody Usuario usuario) {
            return usuarioRepository.save(usuario);
        }
    }




