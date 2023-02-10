package br.edu.set.execs;

import java.util.*;

public class Ex1 {
    /*
    Crie uma conjunto contendo as cores do arco-íris e: [x]
    a) Exiba todas as cores o arco-íris uma abaixo da outra; [x]
    b) A quantidade de cores que o arco-íris tem; [x]
    c) Exiba as cores em ordem alfabética; [x]
    d) Exiba as cores na ordem inversa da que foi informada; [x]
    e) Exiba todas as cores que começam com a letra ”v”; [x]
    f) Remova todas as cores que não começam com a letra “v”; [x]
    g) Limpe o conjunto; [x]
    h) Confira se o conjunto está vazio;
    */
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>();
        arcoIris.add("vermelha");
        arcoIris.add("laranja");
        arcoIris.add("amarela");
        arcoIris.add("verde"); 
        arcoIris.add("azul"); 
        arcoIris.add("azul-escuro");
        arcoIris.add("violeta");

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // A
        for(String cores: arcoIris)
        {
            System.out.println(cores);
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // B
        System.out.println("Quantidade: " + arcoIris.size());

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // C
        Set<String> arcoIris2 = new TreeSet<String>(arcoIris);
        for (String string : arcoIris2) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // D
        Set<String> arcoIrisInformed = new LinkedHashSet<String>();
        
        arcoIrisInformed.add("azul-escuro");
        arcoIrisInformed.add("verde"); 
        arcoIrisInformed.add("laranja");
        arcoIrisInformed.add("vermelha");
        arcoIrisInformed.add("amarela");
        arcoIrisInformed.add("azul"); 
        arcoIrisInformed.add("violeta");
        
        List<String> arcoIris3 = new ArrayList<String>(arcoIrisInformed);
        for (String string : arcoIris3) {
            System.out.println(string);
        }
        
        System.out.println();
        System.out.println("Invertido...");
        Collections.reverse(arcoIris3);
        System.out.println();

        for (String string : arcoIris3) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // E
        Set<String> arcoIris4 = new TreeSet<>(arcoIris);
        for (String cor : arcoIris4) {
            if(cor.startsWith("v"))
            {
                System.out.println(cor);
            }
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // F
        arcoIris.clear();
        arcoIris.add("vermelha");
        arcoIris.add("laranja");
        arcoIris.add("amarela");
        arcoIris.add("verde"); 
        arcoIris.add("azul"); 
        arcoIris.add("azul-escuro");
        arcoIris.add("violeta");

        Iterator<String> i = arcoIris.iterator();
        while(i.hasNext())
        {
            if(!i.next().startsWith("v"))
            {
                i.remove();
            }
        }
        
        for (String string : arcoIris) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("----------");
        System.out.println();

        // G
        arcoIris.clear();
        arcoIris2.clear();
        arcoIris3.clear();
        arcoIris4.clear();
        arcoIrisInformed.clear();

        // H
        System.out.println("Lista 1 está vazia? " + arcoIris.isEmpty());
        System.out.println("Lista 2 está vazia? " + arcoIris2.isEmpty());
        System.out.println("Lista 3 está vazia? " + arcoIris3.isEmpty());
        System.out.println("Lista 4 está vazia? " + arcoIris4.isEmpty());
        System.out.println("Lista 5 está vazia? " + arcoIrisInformed.isEmpty());
        
    }
}
