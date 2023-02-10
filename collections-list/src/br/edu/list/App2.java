package br.edu.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        
        System.out.println("---- ordenação ----");

        // Crie uma lista e ordene ela exibindo nome, cor e idade

        List<Gato> meusGatos = new ArrayList<>();

        meusGatos.add(new Gato("Amora", "Laranja", 48));
        meusGatos.add(new Gato("Mel", "Misturada", 12));
        meusGatos.add(new Gato("Eva", "Siamês", 24));

        
        System.out.println("exiba pela ordem de inserção");
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba na ordem aleatória");
        System.out.println(meusGatos);
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba na ordem natural(nome)");
        System.out.println(meusGatos);
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba na ordem de idade");
        System.out.println(meusGatos);
        Collections.sort(meusGatos,new ComparatorIdade());
        // meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba na ordem das cores");
        System.out.println(meusGatos);
        Collections.sort(meusGatos, new ComparatorCor());
        // meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba na ordem de nome/cor/idade");
        System.out.println(meusGatos);
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        // meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
