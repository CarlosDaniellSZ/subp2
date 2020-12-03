package com.example.subp2;

import java.util.Date;

public class CadPessoal {

    private String id;
    private String nome;
    private Integer idade;
    private Integer cpf;
    private Date datanascimento;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return  "NOME: " + nome + '\'' +
                "IDADE: " + idade + '\'' +
                "CPF: " + cpf + '\'' +
                ", DATA NC: " + datanascimento ;
    }
}
