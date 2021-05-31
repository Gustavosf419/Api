package com.zup.api.Orange.Desafio.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Set;

    @Entity
    @Table(name="usuario")
    public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idUsuario")
        private Integer id;

        @Column(name = "nome" ,nullable = false)
        private String nome;

        @Column(name = "email", unique = true, nullable = false)
        private String email;

        @Column(name = "cpf", unique = true, nullable = false)
        private String cpf;

        @Column(name = "dataNascimento")
        private String dataNascimento;

        @OneToMany (mappedBy = "usuario")
        @JsonManagedReference
        private Set<Carro> carro;


        public Usuario() {
        }

        public Usuario(Integer id, String nome, String email, String cpf, String dataNascimento) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getdataNascimento() {
            return dataNascimento;
        }

        public void setdataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public Set<Carro> getCarro() {
            return carro;
        }

        public void setCarro(Set<Carro> carro) {
            this.carro = carro;
        }
    }


