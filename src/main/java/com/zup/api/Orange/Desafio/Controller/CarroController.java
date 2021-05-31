package com.zup.api.Orange.Desafio.Controller;

import com.zup.api.Orange.Desafio.Model.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zup.api.Orange.Desafio.Controller.CarroService;
    @RestController
    @RequestMapping("/carros")
    public class CarroController {

        @Autowired
        private CarroService carroService;
        @PostMapping("/usuario/{id}")
        @ResponseStatus(HttpStatus.CREATED)
        public Carro saveCarro(@RequestBody Carro carro, @PathVariable("id") String id)  {
            return carroService.saveCarro(carro,id);
        }

    }

