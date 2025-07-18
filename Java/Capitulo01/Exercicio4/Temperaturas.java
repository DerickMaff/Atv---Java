package Exercicio4;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        
        // Declarando valores para o usuário escrever 
        float valor_c;
        float valor_f;

        Conversos_Temperatura Conversor = new Conversos_Temperatura();

        Scanner gerador = new Scanner(System.in);

        System.out.println(" Escreva em °C");
        valor_c = gerador.nextFloat();

        // Chamada para aparecer o valor em Fahrenheit
        Conversor.celsiusParaFahrenheit(valor_c);


        System.out.println(" Escreva em °F");
        valor_f = gerador.nextFloat();

        // Chamada para aparecer o valor  em Celcios
        Conversor.fahrenheitParaCelsius(valor_f);

        gerador.close();
    }
}
