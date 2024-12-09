package com.deadman360;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Scanner;

import com.deadman360.modelos.Cep;
import com.deadman360.modelos.Http;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int opt = 0;
        Cep cep = new Cep();
        while (opt != 3){
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            //Http init
            HttpClient client = HttpClient.newHttpClient();
            Http http = new Http(client);
            System.out.println("""
                **************************
                Bem vindo ao consulta CEP
                **************************
                1 - Consultar CEP
                2 - Verificar Historico de CEPS
                3 - Sair
                """);
                opt = scan.nextInt();
                 
                switch (opt) {
                case 1 -> {
                        try{
                            System.out.println("Digite o Cep desejado: ");
                            cep.setCep(scan2.nextLine().replaceAll("[^\\d]", ""));
                            cep.consultaCep(http);
                        }catch( InterruptedException | IOException e){
                        System.out.println("Falha ao consultar o cep informado: " + e.getMessage());
                    }
                }
                case 2 -> {
                    try{
                        Scanner scan1 = new Scanner(cep.getHistorico());
                        while (scan1.hasNextLine()){
                            System.out.println(scan1.nextLine());
                        }
                        scan1.close();

                    }catch(FileNotFoundException e){
                        System.out.println("Historico não encontrado: " + e.getMessage());
                    }

                }         
                default -> System.out.println("Saindo..");
            }

        }
        
    }
}
