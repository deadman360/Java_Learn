package com.deadman360;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.deadman360.projeto.modelos.Filme;
import com.deadman360.projeto.modelos.Serie;
import com.deadman360.projeto.modelos.Titulo;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        // Titulo topgun = new Titulo("Top Gun", 2020, true, 190);
        // topgun.exibeFichaTencica();
        // System.out.println("Media: %.2f".formatted(topgun.getMedia()));
        // Filme topgun = new Filme();
        // topgun.setDuracao(190);
        // topgun.setNome("TopGun: Maverick");
        // topgun.setAnoLancamento(2020);
        // topgun.avalia(8.39);
        // topgun.avalia(5.65);
        // topgun.avalia(5.98);
        // topgun.avalia(10);

        // Serie supernatural = new Serie();
        // supernatural.setNome("Supernatural");
        // supernatural.setTemporadas(14);
        // supernatural.setEpisodiosTemporada(24);
        // supernatural.setAtiva(false);
        // supernatural.setMinutosEpisodios(43);

        // CalculadoraDeTempo calc = new CalculadoraDeTempo();
        // calc.incluiTempo(topgun);
        // calc.incluiTempo(supernatural);
        // System.out.println(
        //     "Tempo em minutos de sua lista: %d".formatted(calc.getTempoTotal())
        // );
        // System.out.println(
        //     "Tempo em horas de sua lista: %d".formatted(calc.getHoras())
        // );
        // System.out.println(
        //     "Tempo em dias de sua lista: %.2f".formatted(calc.getDias())
        // );

        // Recomendacao filtro = new Recomendacao();
        // filtro.filtra(topgun);

        // ArrayList<Filme> listaFilmes = new ArrayList<>();
        // listaFilmes.add(topgun);
        // System.out.println(listaFilmes.get(0).getNome());
        // System.out.println("Tamanho da lista: %d".formatted(listaFilmes.size()));
        
        List<Titulo> listaAssistidos = new LinkedList<>();

        Titulo topgun = new Filme("diretor",2020, 190, true,"TopGun: Maverick");
        Titulo avengers = new Filme("diretor",2018, 210, true,"Avengers: Ultimatum");
        Titulo suspeitos = new Filme("diretor",2016,192,true, "Os Suspeitos");

        Titulo supernatural = new Serie(true, 24, 43, 15, 2000, true, "Supernatural");
        Titulo got = new Serie(true, 10, 50, 8, 2012, true, "Game of Thrones");
        Titulo hod = new Serie(true, 10, 50, 2, 2022, true, "House of the Dragon");

        //Filme f = suspeitos; Variavel de referencia
        listaAssistidos.add(topgun);
        listaAssistidos.add(avengers);
        listaAssistidos.add(suspeitos);
        listaAssistidos.add(supernatural);
        listaAssistidos.add(got);
        listaAssistidos.add(hod);
        // Devido a objetos novos nao terem sido criados essas variaveis(item, filme) sao apenas referencias 
        System.out.println("\n\nDesordenados:");
         for (Titulo item:listaAssistidos){
             System.out.println(item);
             if (item instanceof Filme filme && filme.getAnoLancamento() > 2017){
                filme.getDiretor();
             }
             // Filme filme = (Filme) item;
             // System.out.println("Classificação: "+ filme.getClassificacao());
            }
            // listaAssistidos.forEach(item -> System.out.println(item));
            // listaAssistidos.forEach(System.out::println);
            listaAssistidos.sort(Comparator.comparingInt(Titulo::getAnoLancamento).reversed());

            System.out.println("\n\nOrdenados:");
            for (Titulo item:listaAssistidos){
                System.out.println(item);
                if (item instanceof Filme filme && filme.getAnoLancamento() > 2017){
                   filme.getDiretor();
                }
        }
    }
}