package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo {
    private static final double XP_BONUS = 20d;

    @Getter
    @Setter
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return data == mentoria.data &&
                getTitulo().equals(mentoria.getTitulo()) &&
                getDescricao().equals(mentoria.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, getTitulo(), getDescricao());
    }
}
