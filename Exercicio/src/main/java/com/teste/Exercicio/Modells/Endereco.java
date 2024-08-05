package com.teste.Exercicio.Modells;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private int numero;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, int numero) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
