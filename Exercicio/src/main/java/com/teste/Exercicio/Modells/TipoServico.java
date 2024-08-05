package com.teste.Exercicio.Modells;

import jakarta.persistence.*;

@Entity
public class TipoServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipoServico")
    private String TipoServico;

    public TipoServico() {
    }

    public TipoServico(String tipoServico) {
        TipoServico = tipoServico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String tipoServico) {
        TipoServico = tipoServico;
    }
}
