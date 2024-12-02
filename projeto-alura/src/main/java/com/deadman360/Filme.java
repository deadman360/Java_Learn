package com.deadman360;

public class Filme{
    String nome;
    int anoDeLançamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public Filme(String nome,
     int anoDeLançamento,
     boolean incluidoNoPlano,
     double avaliacao,
     int totalDeAvaliacoes,
     int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.avaliacao = avaliacao;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.duracaoEmMinutos = duracaoEmMinutos;

    }
}