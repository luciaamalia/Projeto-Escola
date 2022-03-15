package com.br.lucia.pessoa.domain;

import com.br.lucia.pessoa.domain.enums.EstadoCivil;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private String documento;
    private EstadoCivil estadoCivil;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, Integer idade, String documento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", documento='" + documento + '\'' +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}
