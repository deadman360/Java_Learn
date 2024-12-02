package com.deadman360;

public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public Filme(
        String nome,
        int anoLancamento,
        boolean incluidoNoPlano,
        double avaliacao,
        int totalDeAvaliacoes,
        int duracaoEmMinutos
    ) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.avaliacao = avaliacao;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean getIncluido() {
        return incluidoNoPlano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getTotalAvaliacao() {
        return totalDeAvaliacoes;
    }

    public int getDuracao() {
        return duracaoEmMinutos;
    }

    //Setters
    public void setNome(String value) {
        this.nome = value;
    }

    public void setAnoLancamento(int value) {
        this.anoLancamento = value;
    }

    public void setIncluido(boolean value) {
        this.incluidoNoPlano = value;
    }

    public void setAvaliacao(double value) {
        this.avaliacao = value;
    }

    public void setTotalAvaliacao(int value) {
        this.totalDeAvaliacoes = value;
    }

    public void setDuracao(int value) {
        this.duracaoEmMinutos = value;
    }
}
