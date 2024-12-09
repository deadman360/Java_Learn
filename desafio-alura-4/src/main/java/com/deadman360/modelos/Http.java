package com.deadman360.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;

public class Http {

    private HttpClient client;
    private HttpRequest request;

    public Http(HttpClient client){
        this.client = client;

    }
    //Getter
    public HttpClient getClient() {
        return client;
    }
    public HttpRequest getRequest() {
        return request;
    }
    //Setter
    public void setRequest(String cep) {
        HttpRequest r = HttpRequest.newBuilder()
        .uri(URI.create("https://viacep.com.br/ws/"+ cep +"/json/"))
        .build();
        this.request = r;
    }
    //Methods
    public String getJson() throws InterruptedException, IOException{
        
        try{
            HttpResponse<String> response = client
        .send(this.request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }catch(Exception e){
        System.out.println("Cep Inválido!");
        return new JsonObject().toString();
    }
        
        
    }

}