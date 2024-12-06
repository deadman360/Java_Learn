package com.deadman360.modelos;

import java.util.List;

public class Cep {

    private String cep;
    private List<Cep> listaCeps; 

    public Cep(String cep){
        this.cep = cep;
    }
    public void consultaCep(Http http){
        http.setRequest(cep);
        http.
    }
}