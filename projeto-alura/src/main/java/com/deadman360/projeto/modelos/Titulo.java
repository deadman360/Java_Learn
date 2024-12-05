package com.deadman360.projeto.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private  String nome;
    @SerializedName("Year")
    private  int anoLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    //  @SerializedName("Runtime")
    private int duracaoEmMinutos;

    // public Titulo(
    //     String nome,
    //     int anoLancamento,
    //     boolean incluidoNoPlano,
    //     int duracaoEmMinutos
    // ) {
    //     this.nome = nome;
    //     this.anoLancamento = anoLancamento;
    //     this.incluidoNoPlano = incluidoNoPlano;
    //     this.duracaoEmMinutos = duracaoEmMinutos;
    // }

    public Titulo(int anoLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, String nome) {
        this.anoLancamento = anoLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
        this.nome = nome;
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
    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
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

    // public void setAvaliacao(double value) {
    //     this.avaliacao = value;
    // }

    // public void setTotalAvaliacao(int value) {
    //     this.totalDeAvaliacoes = value;
    // }

     public void setDuracao(int value) {
         this.duracaoEmMinutos = value;
     }
    //Methods
    public void exibeFichaTencica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    public void avalia(double nota){
        this.somaAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }
    public  double getMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "Filme: %s\nAno de lançamento: %d\n".formatted(this.nome, this.anoLancamento);
    }
    public int compareTo(Titulo titulo){
        if (this.getAnoLancamento() < titulo.getAnoLancamento()){
            return -1;
        }
        if (this.getAnoLancamento() > titulo.getAnoLancamento()){
            return 1;
        }
        return 0;
    }
}
