package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;
import lombok.Setter;

abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    abstract double calculaXP();
}
