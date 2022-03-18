package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;

public class Curso extends Conteudo {
    @Getter
    private int cargaHoraria;

    @Override
    double calculaXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("Mentoria{ titulo='%s', descricao='%s', cargaHoraria=%d}",
                getTitulo(), getDescricao(), cargaHoraria
        );
    }
}
