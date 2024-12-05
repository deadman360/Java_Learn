package com.deadman360;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.deadman360.projeto.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        String query = scan.nextLine();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://www.omdbapi.com/?t=" + query.toLowerCase() +"&apikey=c4250142&"))
              .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .create();
        TituloOmdb novoTitulo = gson.fromJson(json, TituloOmdb.class);
        
        System.out.println(novoTitulo + "\n Tmepo de duração: ");
    }   
}