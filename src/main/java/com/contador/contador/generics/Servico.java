package com.contador.contador.generics;

public class Servico {
    private String descricao;

    public Servico() {}

    public Servico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}