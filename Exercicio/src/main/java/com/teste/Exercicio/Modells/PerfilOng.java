package com.teste.Exercicio.Modells;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "ong")
public class PerfilOng {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "Nome_ong", nullable = false)
    private String nome;

    private String razaoSocial;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Date dataFundacao;

    @Column(nullable = false)
    @OneToOne
    private TipoServico servico;

    @Column(nullable = false)
    @ManyToOne
    private Endereco endereco;

    public PerfilOng() {
    }

    public PerfilOng(String nome, String razaoSocial, String descricao, Date dataFundacao, TipoServico servico, Endereco endereco) {
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.descricao = descricao;
        this.dataFundacao = dataFundacao;
        this.servico = servico;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public TipoServico getServico() {
        return servico;
    }

    public void setServico(TipoServico servico) {
        this.servico = servico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
