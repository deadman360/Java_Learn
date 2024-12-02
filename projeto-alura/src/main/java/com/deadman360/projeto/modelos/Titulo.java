package com.deadman360.projeto.modelos;

public class Titulo {

    private  String nome;
    private  int anoLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
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
}
