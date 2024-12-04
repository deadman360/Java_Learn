package com.deadman360.modelos;

public class Compra {

    private String compra;
    private double valor;

    public Compra(String compra, double valor) {
        this.compra = compra;
        this.valor = valor;
    }
    
    
    public String getCompra() {
        return compra;
    }

    public double getValor() {
        return valor;
    }

    
}