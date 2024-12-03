package com.deadman460.desafio.modelos;

import com.deadman460.desafio.interfaces.Classificavel;

public class Audio implements Classificavel {

    private final String titulo;
    private final int duracaoMinutos;
    private int totalReproducoes;
    private int curtidas;

    public Audio( String titulo,int duracaoMinutos,int totalReproducoes) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.totalReproducoes = totalReproducoes;
    }

    
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }   

    //Methods

    public void curtir(){
        curtidas++;
        totalReproducoes++;
    }
    
    @Override
    public int getClassificacao(){
        return this.getCurtidas() / this.getTotalReproducoes();
    }
}