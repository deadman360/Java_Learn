package com.deadman360.app;

import java.util.ArrayList;
import java.util.List;
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
        List<Compra> compras = new ArrayList<>();
        int opt = 0;
        Cartao cartao = new Cartao(1000, compras);
        while (opt != 3){
        Scanner scan = new Scanner(System.in);
        System.out.println("""
        **********************
        Bem vindo a sua conta!
        Saldo disponível: R$ %.2f 
        **********************
        1 - Comprar
        2 - Exibir extrato
        3 - Sair""".formatted(cartao.getLimite()));
        opt = scan.nextInt();
        switch (opt) {
            case 1:
                Compra novaCompra = cartao.compra();
                if (novaCompra.getValor() == 0){
                    System.out.println("Saldo insuficiente");
                    break;
                }
                compras.add(novaCompra);
                break;
             case 2:
                 cartao.extrato();
                 break;
            default:
                System.out.println("Saindo...");
                break;
        }  
        }       
    }
    
}
