package com.deadman360.projeto.caclulos;

public class Recomendacao {


    public void filtra(Classificavel obra){
        if (obra.getClassificacao() >= 4){
            System.out.println("Baum, pode ver ta nos 20 melhores");
        }else{
            System.out.println("Ruimzinho mas ve da mesma forma vai que ce gosta");
        }
    }
}