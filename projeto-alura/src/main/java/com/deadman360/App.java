package com.deadman360;

import com.deadman360.projeto.caclulos.CalculadoraDeTempo;
import com.deadman360.projeto.modelos.Filme;
import com.deadman360.projeto.modelos.Serie;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        // Titulo topgun = new Titulo("Top Gun", 2020, true, 190);
        // topgun.exibeFichaTencica();
        // topgun.avalia(8.39);
        // topgun.avalia(5.65);
        // topgun.avalia(5.98);
        // topgun.avalia(10);
        // System.out.println("Media: %.2f".formatted(topgun.getMedia()));
        Filme topgun = new Filme();
        topgun.setDuracao(190);
        topgun.setNome("TopGun: Maverick");
        topgun.setAnoLancamento(2020);

        Serie supernatural = new Serie();
        supernatural.setNome("Supernatural");
        supernatural.setTemporadas(14);
        supernatural.setEpisodiosTemporada(24);
        supernatural.setAtiva(false);
        supernatural.setMinutosEpisodios(43);

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.incluiTempo(topgun);
        calc.incluiTempo(supernatural);
        System.out.println("Tempo em minutos de sua lista: %d".formatted(calc.getTempoTotal()));
        System.out.println("Tempo em horas de sua lista: %d".formatted(calc.getHoras()));
        System.out.println("Tempo em dias de sua lista: %.2f".formatted(calc.getDias()));

    }
}
