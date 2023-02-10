package br.edu.list.execs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    /*
    Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista. [X]
    Após isto, calcule a média semestral das temperaturas [X] e mostre todas as temperaturas acima desta média,
    e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> mediaTemperatura = new ArrayList<>();
        
        // captura das temperaturas dos meses
        for(int i = 0; i < 6; i++)
        {
            Double mes = 0d;
            System.out.print("Insira a temperatura: ");
            mes = sc.nextDouble();
            mediaTemperatura.add(mes);
        }

        // media total
        Iterator<Double> it = mediaTemperatura.iterator();
        Double soma = 0d;
        while(it.hasNext())
        {
            Double next = it.next();
            soma += next;
        }
        
        Double media = soma/mediaTemperatura.size();

        System.out.printf("Média geral: %.2f", media);
        System.out.println();

        int count = 0;
        Iterator<Double> it2 = mediaTemperatura.iterator();
        while(it2.hasNext())
        {   
            Double temp = it2.next();
            if(temp > media)
            {
                switch(count)
                {
                    case 0:
                        System.out.printf("1 - Janeiro: %.2f\n", temp);
                        break;    
                    case 1:
                        System.out.printf("2 - Fevereiro: %.2f\n", temp);
                        break;
                    case 2:
                        System.out.printf("3 - Março: %.2f\n", temp);
                        break;
                    case 3:
                        System.out.printf("4 - Abril: %.2f\n", temp);
                        break;
                    case 4:
                        System.out.printf("5 - Maio: %.2f\n", temp);
                        break;
                    case 5:
                        System.out.printf("6 - Junho: %.2f\n", temp);
                        break;
                    default:
                        System.out.println("Erro");
                        break;
                }
            }
            count++;
        }
        
        sc.close();
    }
}
