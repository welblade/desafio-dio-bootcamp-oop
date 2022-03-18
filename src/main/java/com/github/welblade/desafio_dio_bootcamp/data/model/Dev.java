package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    @Getter
    private String nome;
    @Getter
    private final Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    @Getter
    private final Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp() {

    }

    public void progredir() {

    }

    public void calcularXPTotal() {

    }
}
