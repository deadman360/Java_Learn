package com.deadman360.projeto.caclulos;

import com.deadman360.projeto.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;
    
    public int getTempoTotal(){
        return tempoTotal;
    }
    public int getHoras(){
        return tempoTotal/60;
    }
    public double  getDias(){
        double horas = this.getHoras();
        return  horas /24;
    }
    public void incluiTempo(Titulo obra){
        tempoTotal += obra.getDuracao();
    }
    
}