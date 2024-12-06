package com.deadman360;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deadman360.projeto.modelos.Titulo;
import com.deadman360.projeto.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String query = "";
        List<Titulo> titulos= new ArrayList<>();
        Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
        .setPrettyPrinting()
        .create();
        while (!query.equalsIgnoreCase("sair")){
        try {
        System.out.println("Digite um filme para busca: ");
        query = scan.nextLine().replaceAll("\\s", "+");
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://www.omdbapi.com/?t=" + query.toLowerCase() +"&apikey=c4250142&"))
              .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        TituloOmdb novoTituloTmp = gson.fromJson(json, TituloOmdb.class);

            Titulo novoTitulo = new Titulo(novoTituloTmp);
            System.out.println(novoTitulo);
            titulos.add(novoTitulo);

        } catch (RuntimeException e) {
            System.out.println("Aconteceu um erro na busca: ");
            System.out.println(e.getMessage());
        }
    }
    System.out.println(titulos);
    File filmesjson = new File("/workspaces/Java_Learn/projeto-alura/filmes.json");
    FileWriter writer = new FileWriter(filmesjson);
    writer.write(gson.toJson(titulos));
    writer.close();
    }   
}