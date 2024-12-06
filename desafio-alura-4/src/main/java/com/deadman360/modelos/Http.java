package com.deadman360.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
        .uri(URI.create("https://viacep.com.br/ws"+ cep +"json/"))
        .build();
        this.request = r;
    }
    //Methods
    public getJson() throws InterruptedException{
        
        try{HttpResponse<String> response = client
        .send(this.request, HttpResponse.BodyHandlers.ofString());
        }catch(IOException e) {
            System.out.println("ocorreu um erro");
        }
    }

}