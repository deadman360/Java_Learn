package com.deadman460.desafio.modelos;

public class Podcast extends Audio {

    private String episodio;
    private final String convidado;
    private final int numeroEp;

    public Podcast(String convidado, String episodio, int numeroEp, String titulo, int duracaoMinutos, int totalReproducoes) {
        super(titulo, duracaoMinutos, totalReproducoes);
        this.convidado = convidado;
        this.episodio = episodio;
        this.numeroEp = numeroEp;
    }

    //Constructor
    
    //Getters
    public String getEpisodio() {
        return episodio;
    }

    public String getConvidado() {
        return convidado;
    }

    public int getNumeroEp() {
        return numeroEp;
    }
    //Setter
    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }
    
}