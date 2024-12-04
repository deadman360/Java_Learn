package com.deadman360.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.deadman360.modelos.Cartao;
import com.deadman360.modelos.Compra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Double> compras = new HashMap<>();
        int opt = 0;
        while (opt != 3){
        Scanner scan = new Scanner(System.in);
        Cartao cartao = new Cartao(1000);
        System.out.println("""
        **********************
        Bem vindo a sua conta!
        Saldo disponível: %d R$
        **********************
        1 - Comprar
        2 - Exibir extrato
        3 - Sair""".formatted(cartao.getLimite()));
        opt = scan.nextInt();
        scan.close();
        switch (opt) {
            case 1:
                Compra novaCompra = cartao.compra();
                if (novaCompra.getValor() == 0){
                    System.out.println("Saldo insuficiente");
                    break;
                }
                compras.put(novaCompra.getCompra(), novaCompra.getValor());
                break;
            // case 2:
            //     extrato();
            //     break;
            default:
                System.out.println("Saindo...");
                break;
        }  
        }       
    }
    
}
