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

    abstract double calculaXP();
}
