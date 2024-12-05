package com.deadman360.modelos;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Cartao {
    private double limite;
    private List<Compra> compras;
    
    public Cartao(double limite, List<Compra> compras) {
        this.limite = limite;
        this.compras = compras;
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
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Descreva sua compra");
        compra = s1.nextLine();
        System.out.println("Quanto custa?");
        valor = s2.nextDouble();
        if (this.limite < valor){
            return new Compra("", 0);
        }
        this.limite = this.limite - valor;
        return new Compra(compra, valor);
        
    }
    
    public void extrato(){
        this.compras.sort(Comparator.comparingDouble(compra -> compra.getValor()));
        for (Compra compra: this.compras){
            System.out.println("""
                    *****************
                    Compra: %s
                    Valor: %.2f
                    *****************
                    """.formatted(compra.getCompra(), compra.getValor()));
        }
        System.out.println("""
                ******************
                Saldo restante: %.2f
                ******************
                """.formatted(this.limite));       
    }
}