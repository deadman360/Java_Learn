package com.deadman360.modelos;

import java.util.Scanner;


public class Cartao {
    private double limite;
    
    public Cartao(double limite) {
        this.limite = limite;
    }

    //Setter
    

    // Scan and set
    // public void setLimite(){
    //         Scanner scan = new Scanner(System.in);
    //         this.limite = scan.nextDouble();
    //         scan.close();
    // }

    //Getter
    public double getLimite() {
        return limite;
    }
    public Compra compra(){
        String compra;
        double valor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Descreva sua compra");
        compra = scan.nextLine();
        System.out.println("Quanto custa?");
        valor = scan.nextDouble();
        if (this.limite < valor){
            return new Compra("", 0);
        }
        this.limite -= valor;
        return new Compra(compra, valor);
        
    }
    
}