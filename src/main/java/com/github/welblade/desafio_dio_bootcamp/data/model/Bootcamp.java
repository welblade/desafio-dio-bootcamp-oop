package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    @Getter
    private String nome;
    @Getter
    private String descricao;
    @Getter
    private LocalDate dataInicial;
    @Getter
    private LocalDate dataFinal;
    @Getter
    private final Set<Dev> devsInscritos = new HashSet<>();
    @Getter
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

}
