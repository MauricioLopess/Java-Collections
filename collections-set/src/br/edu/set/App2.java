package br.edu.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App2 {
    public static void main(String[] args) {
        System.out.println("---- ordenação ----");

        // Crie uma lista e ordene ela exibindo nome, gênero e tempo de episódio
        // de forma aleatória
        Set<Serie> series = new HashSet<>();

        series.add(new Serie("TWD", "Fição", 60));
        series.add(new Serie("BigBang Theory", "Comédia", 30));
        series.add(new Serie("Dark", "Fição", 60));

        for (Serie serie : series) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba na ordem de inserção
        Set<Serie> series2 = new LinkedHashSet<>();

        series2.add(new Serie("TWD", "Fição", 60));
        series2.add(new Serie("BigBang Theory", "Comédia", 30));
        series2.add(new Serie("Dark", "Fição", 60));

        for (Serie serie : series2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba na ordem de tempo de episódio
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie : series3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba comparando nome, gênero e tempo de episódio
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        series4.addAll(series);
        for (Serie serie : series4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba ordenando por gênero
        Set<Serie> series5 = new TreeSet<>(new ComparatorGenero());
        series5.addAll(series);
        for (Serie serie : series5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        //exiba ordenando tempo de episódio
        Set<Serie> series6 = new TreeSet<>(new ComparatorTempoEpisodio());
        series6.addAll(series);
        for (Serie serie : series6) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}
