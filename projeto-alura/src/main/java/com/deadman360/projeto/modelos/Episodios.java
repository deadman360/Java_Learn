package com.deadman360.projeto.modelos;

public class Episodios {

    private int numero;
    private String nome;
    private Serie serie;

    public int getNumero() {
        return numero;
    }
    public String getNome() {
        return nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}