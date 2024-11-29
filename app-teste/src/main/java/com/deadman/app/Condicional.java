package com.deadman;

import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        System.out.println("Me diga um numero: ");
        int num = ler.nextInt(); 
        System.out.println((num > 20 ? "maior q 20": "menor que 20"));
        ler.close();
    }
}