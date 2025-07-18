package Exercicio8;

import java.util.Scanner;
public class ChamarTemperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float valorEmF;
        
        System.out.print(" Escreva a Temperatura em Fahrenheit: ");
        valorEmF = scanner.nextFloat();

        // Construtor
        Temperatura temperatura1 = new Temperatura(valorEmF);

        //Método
        temperatura1.ExibirTemperatura();

        scanner.close();
    }
}
