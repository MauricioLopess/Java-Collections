package br.edu.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("---- implementação e criação ----");

        // crie uma lista e adicione 7 notas
        Set<Double> notas = new HashSet<>();

        notas.add(5d);
        notas.add(5d);
        notas.add(4.2);
        notas.add(7.8);
        notas.add(9.2);
        notas.add(3.5);
        notas.add(2.7);

        System.out.println(notas);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // confira se existe 5 no conjunto 
        System.out.println(notas.contains(5d));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba a menor nota
        System.out.println(Collections.min(notas));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba a maior nota
        System.out.println(Collections.max(notas));
        
        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba a soma dos valores
        Iterator<Double> i = notas.iterator();
        Double soma = 0d;
        while(i.hasNext())
        {
            Double next = i.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba a média das notas
        System.out.println(soma/notas.size());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // remova a nota 0
        notas.remove(0d);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // remova as notas menores que 7
        Iterator<Double> i2 = notas.iterator(); 
        while(i2.hasNext())
        {
            if(i2.next() < 7) i2.remove();
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba as notas na ordem que foram informadas
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(5d);
        notas2.add(5d);
        notas2.add(4.2);
        notas2.add(7.8);
        notas2.add(9.2);
        notas2.add(3.5);
        notas2.add(2.7);

        System.out.println(notas);
        System.out.println(notas2);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // exiba todas notas em ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // apague todo conjunto
        notas3.clear();

        // confira se a lista está vazia
        System.out.println(notas3.isEmpty());
    }
}
