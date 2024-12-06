package com.deadman360;

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
        while (opt != 3){
            Scanner scan = new Scanner(System.in);
            //Http init
            HttpClient client = HttpClient.newHttpClient();
            Http http = new Http(client, "https://viacep.com.br/ws/01001000/json/");
            System.out.println("""
                **************************
                Bem vindo ao consulta CEP
                **************************
                1 - Consultar CEP
                2 - Verificar Historico de CEPS
                3 - Sair
                """);
                opt = scan.nextInt();
                System.out.println("Digite o Cep desejado: ");
                scan.reset();
                Cep cep = new Cep(scan.nextLine().replaceAll("[^\\d]", "")); 
                switch (opt) {
                case 1 -> cep.consultaCep(http);
                case 2 -> cep.getHistorico();        
                default-> System.out.println("Saindo..");
            }
        }
    }
}
