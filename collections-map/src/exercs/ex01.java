package exercs;

import java.util.*;

public class ex01 {
    /*
    Dada a população estimada de alguns estados do NE brasileiro, faça:
    - Estado = PE - População = 9.616.621
    - Estado = AL - População = 3.351.543
    - Estado = CE - População = 9.187.103
    - Estado = RN - População = 3.534.265
    a)Crie um dicionário e relacione os estados e suas populações;[x]
    b)Substitua a população do estado do RN por 3.534.165;[x]
    c)Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;[x]
    d)Exiba a população PE;[x]
    e)Exiba todos os estados e suas populações na ordem que foi informado;[x]
    f)Exiba os estados e suas populações em ordem alfabética;[x]
    g)Exiba o estado com a menor população e sua quantidade;[x]
    h)Exiba o estado com a maior população e sua quantidade;[x]
    i)Exiba a soma da população desses estados;[x]
    j)Exiba a média da população deste dicionário de estados;[x]
    k)Remova os estados com a população menor que 4.000.000;[x]
    l)Apague o dicionário de estados;[x]
    m)Confira se o dicionário está vazio.[x]
     */

     public static void main(String[] args) {

        // a
        Map<String, Double> estados = new HashMap<>();

        estados.put("PE", 9616621d);
        estados.put("AL", 3351543d);
        estados.put("CE", 9187103d);
        estados.put("RN", 3534265d);
        System.out.println();
        for(Map.Entry<String, Double> entry : estados.entrySet())
        {
            System.out.printf("Estado: %s População: %.0f \n", entry.getKey(),entry.getValue());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // b
        estados.put("RN", 3534165d);

        for(Map.Entry<String, Double> entry : estados.entrySet())
        {
            System.out.printf("Estado: %s, População: %.0f \n", entry.getKey(),entry.getValue());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // c
        if(!estados.containsKey("PB"))
        {
            System.out.println("Adicionando Paraíba...");
            estados.put("PB", 4039277d);
        }

        for(Map.Entry<String, Double> entry : estados.entrySet())
        {
            System.out.printf("Estado: %s, População: %.0f \n", entry.getKey(),entry.getValue());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // d
        System.out.printf("População de Pernambuco: %.0f", estados.get("PE"));

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // e 
        Map<String, Double> estados1 = new LinkedHashMap<>(estados);
        for(Map.Entry<String, Double> entry : estados1.entrySet())
        {
            System.out.printf("Estado: %s, População: %.0f \n", entry.getKey(),entry.getValue());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // f
        Map<String, Double> estados2 = new TreeMap<>(estados1);
        for(Map.Entry<String, Double> entry : estados2.entrySet())
        {
            System.out.printf("Estado: %s, População: %.0f \n", entry.getKey(), entry.getValue());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();
        
        // g e h
        Double menorPop = Collections.min(estados.values());
        Double maiorPop = Collections.max(estados.values());
        String estadoMaiorPop = "";
        String estadoMenorPop = "";

        for(Map.Entry<String, Double> entry : estados.entrySet())
        {
            if(entry.getValue().equals(menorPop))
            {
                estadoMenorPop = entry.getKey();
                System.out.printf("Estado com menor população: %s - %.0f \n", entry.getKey(), entry.getValue());
            }

            if(entry.getValue().equals(maiorPop))
            {
                estadoMaiorPop = entry.getKey();
                System.out.printf("Estado com maior população: %s - %.0f \n", entry.getKey(), entry.getValue());
            }
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();
       
        // i e j
        Double soma = 0d;
        Iterator<Double> i = estados.values().iterator();
        while(i.hasNext())
        {
            soma += i.next();
        }

        System.out.printf("População total: %.0f\n Media: %.0f", soma, soma/estados.size());
        
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // k
        Iterator<Double> i2 = estados.values().iterator();
        while(i2.hasNext())
        {
            if(i2.next() < 4000000d) i2.remove();
        }

        for(Map.Entry<String, Double> entry : estados.entrySet())
        {
            System.out.printf("Estado: %s, População: %.0f \n", entry.getKey(), entry.getValue());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // l e m
        estados.clear();
        System.out.println("Está vazio? " +estados.isEmpty());
    }
}
