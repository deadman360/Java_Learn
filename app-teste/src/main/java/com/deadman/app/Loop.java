package com.deadman.app;

public class Loop {

    public static int fatorial(int num){
        int resultado = num;
        while (num != 1){
            resultado *= --num;
        }
        return resultado;
    }
}