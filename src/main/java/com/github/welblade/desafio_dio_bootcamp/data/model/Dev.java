package com.github.welblade.desafio_dio_bootcamp.data.model;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    @Getter
    @Setter
    private String nome;
    @Getter
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    @Getter
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não tem mais nenhum conteúdo para concluir.");
        }
    }

    public double calcularXPTotal() {
        return conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calculaXP)
                .sum();
    }
}
