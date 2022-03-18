package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private static final double XP_BONUS = 20d;

    @Getter
    private LocalDate data;

    @Override
    double calculaXP() {
        return XP_PADRAO + XP_BONUS;
    }

    @Override
    public String toString() {
        return String.format("Mentoria{ titulo='%s', descricao='%s', data=%s}",
                getTitulo(), getDescricao(), data.toString()
        );
    }
}
