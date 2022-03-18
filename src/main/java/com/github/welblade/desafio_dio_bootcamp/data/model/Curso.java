package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Curso extends Conteudo {
    @Getter
    @Setter
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHoraria == curso.cargaHoraria &&
                getTitulo().equals(curso.getTitulo()) &&
                getDescricao().equals(curso.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargaHoraria, getTitulo(), getDescricao());
    }
}
