package com.zup.api.Orange.Desafio.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
public class Carro {

    private String nome;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn (name = "idUsuario")
    private Usuario usuario;

    public Carro() {
    }

    public Carro(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}