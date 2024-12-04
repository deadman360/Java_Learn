package com.deadman360.projeto.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosTemporada;
    private int minutosEpisodios;
    private int totalVisu;

    public Serie(boolean ativa, int episodiosTemporada, int minutosEpisodios, int temporadas, int anoLancamento, boolean incluidoNoPlano, String nome) {
        super(anoLancamento, temporadas * minutosEpisodios * episodiosTemporada, incluidoNoPlano, nome);
        this.ativa = ativa;
        this.episodiosTemporada = episodiosTemporada;
        this.minutosEpisodios = minutosEpisodios;
        this.temporadas = temporadas;
    }

    
    
    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }
    public int getTemporadas(){
        return temporadas;
    }
    public boolean getAtiva(){
        return ativa;
    }
    public int getMinutosEpisodios(){
        return minutosEpisodios;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }
    public void setMinutosEpisodios(int minutosEpisodios) {
        this.minutosEpisodios = minutosEpisodios;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    

    @Override
    public int getDuracao() {
        return temporadas * minutosEpisodios * episodiosTemporada;
    }
    int getClassificacao(){
        return (totalVisu >= 100 ) ? 4:2;
    }
}