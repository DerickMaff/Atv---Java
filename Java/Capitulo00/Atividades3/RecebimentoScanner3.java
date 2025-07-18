package Atividades3;

import java.util.Scanner;

public class RecebimentoScanner3 {
    public static void main(String[] args){ 

        /* Conversão de Milha para Quilõmetro*/
        Scanner gerador = new Scanner(System.in);


        float milha;

        System.out.println("Digite a distância em milha ");
        milha = gerador.nextFloat();

        double quilometro = milha * 1.609344;
        System.out.println(" a distancia "+ milha + " Virou "+ quilometro + " em quilometro");  // resultado da transformação de Milha pra quilômetro


        gerador.close(); //Necessario fechar para não dar erro

    }
}
