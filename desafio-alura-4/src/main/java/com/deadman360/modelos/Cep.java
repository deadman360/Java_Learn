package com.deadman360.modelos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Cep {

    private String cep;
    private File historico;
    private List<Local> locais;
    public Cep(){
        this.locais = new ArrayList<>();
        this.historico = new File("/workspaces/Java_Learn/desafio-alura-4/historico.json");

    }
    public void  consultaCep(Http http)throws InterruptedException, IOException{
       try{ http.setRequest(cep);
        String json = http.getJson();
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
        Local tmp = gson.fromJson(json, Local.class);
        locais.add(tmp);
        FileWriter writer = new FileWriter(historico);
        writer.write(gson.toJson(locais));
        writer.close();
        System.out.println(tmp);
    }catch(InterruptedException | IOException e){
        System.out.println("Erro ao encontrar o cep!:\n " + e.getMessage());
    }
        
    }
    public File getHistorico(){
        return this.historico;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
}