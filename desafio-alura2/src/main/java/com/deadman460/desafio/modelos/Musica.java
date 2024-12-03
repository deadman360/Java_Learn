package com.deadman460.desafio.modelos;

public class Musica extends Audio {
    private  String cantor;
    private String compositor;

    public Musica(String cantor, String compositor, String titulo, int duracaoMinutos, int totalReproducoes) {
        super(titulo, duracaoMinutos, totalReproducoes);
        this.cantor = cantor;
        this.compositor = compositor;
    }

    //Constructor
    
    //Getters
    public String getCantor() {
        return cantor;
    }

    public String getCompositor() {
        return compositor;
    }

    //Setters
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    
}