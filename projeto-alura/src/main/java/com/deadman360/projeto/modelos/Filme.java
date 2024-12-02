package com.deadman360.projeto.modelos;

import com.deadman360.projeto.caclulos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) this.getMedia()/2;
    }

    
}