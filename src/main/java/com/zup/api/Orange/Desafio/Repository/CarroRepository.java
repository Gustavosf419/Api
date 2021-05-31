package com.zup.api.Orange.Desafio.Repository;

import com.zup.api.Orange.Desafio.Model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface CarroRepository  extends JpaRepository<Carro, String> {
    }



