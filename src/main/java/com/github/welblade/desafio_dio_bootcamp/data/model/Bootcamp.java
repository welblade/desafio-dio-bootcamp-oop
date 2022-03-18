package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String descricao;
    @Getter
    private final LocalDate dataInicial;
    @Getter
    private final LocalDate dataFinal;
    @Getter
    private final Set<Dev> devsInscritos = new HashSet<>();
    @Getter
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome,  String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        dataInicial = LocalDate.now();
        dataFinal = dataInicial.plusDays(45);
    }

}
