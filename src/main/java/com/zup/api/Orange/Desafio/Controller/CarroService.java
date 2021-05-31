package com.zup.api.Orange.Desafio.Controller;

import com.zup.api.Orange.Desafio.Model.Carro;
import com.zup.api.Orange.Desafio.Model.Usuario;
import com.zup.api.Orange.Desafio.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;
   public Carro saveCarro(Carro carro, String id){

       return carroRepository.save(carro);
   }
}
