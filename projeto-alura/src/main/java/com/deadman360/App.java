package com.deadman360;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Filme topgun = new Filme("Top Gun", 2020, true, 8.3, 5435, 190);
        topgun.setIncluido(false);
        topgun.setNome("Top gun: Maverick");
    }
}
