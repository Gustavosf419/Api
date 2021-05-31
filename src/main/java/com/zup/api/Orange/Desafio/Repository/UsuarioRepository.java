package com.zup.api.Orange.Desafio.Repository;

import com.zup.api.Orange.Desafio.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

