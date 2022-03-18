package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;

abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    @Getter
    private String titulo;
    @Getter
    private String descricao;

    abstract double calculaXP();
}
