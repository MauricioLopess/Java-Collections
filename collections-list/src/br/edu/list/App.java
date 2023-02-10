package br.edu.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args){
        
        System.out.println("---- implementação e criação ----");

        // crie uma lista e adicione 7 notas
        List<Double> notas = new ArrayList<Double>();

        notas.add(5d);
        notas.add(8d);
        notas.add(4.2);
        notas.add(7.8);
        notas.add(9.2);
        notas.add(3.5);
        notas.add(2.7);

        System.out.println(notas);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba a posição da nota 5");
        System.out.println(notas.indexOf(5d));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("adicione na lista a nota 8 na posição 4");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("confira se a nota 5.0 está na lista");
        System.out.println(notas.contains(5d));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba todas as notas na ordem em que foram informadas");
        for (Double d1 : notas) {
            System.out.println(d1);
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba a terceira nota adicionada");
        System.out.println(notas.get(2));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba a soma dos valores");
        Iterator<Double> i = notas.iterator();
        Double sum = 0d;
        while(i.hasNext())
        {
            Double next = i.next();
            sum += next;
        }

        System.out.printf("%.2f", sum);
        
        System.out.println();
        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("exiba a média das notas");
        System.out.println(sum/notas.size());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("remova a nota 6");
        System.out.println(notas);
        notas.remove(6d);
        System.out.println(notas);
    

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("remova as notas menores que 7");
        System.out.println(notas);

        Iterator<Double> i2 = notas.iterator();
        while(i2.hasNext())
        {
            Double next = i2.next();
            if(next < 7) i2.remove();
        }
        
        System.out.println(notas);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("apague toda lista");
        System.out.println(notas);
        // notas.clear();
        System.out.println(notas);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("confira se a lista está vazia");
        System.out.println(notas.isEmpty());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("crie uma lista nova e coloque todos os elementos da list arraylist nessa nova");

        List<Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("mostre a primeira nota da nova lista sem remove-la");
        System.out.println(notas2);
        System.out.println(notas2.get(0));
        System.out.println(notas2);

        System.out.println();
        System.out.println("----------");
        System.out.println();

        System.out.println("mostre a primeira nota da nova lista removendo-a");

        System.out.println(notas2);
        System.out.println(notas2.remove(0));
        // System.out.println(((LinkedList<Double>) notas2).poll());
        System.out.println(notas2);
    }
}
