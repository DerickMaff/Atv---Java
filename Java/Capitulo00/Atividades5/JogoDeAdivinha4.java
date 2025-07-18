package Atividades5;

import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinha4 {
    public static void main(String[] agrs ){

        Scanner gerador = new Scanner(System.in);

        // Gerando uma variável para guardar o número que vai ser gerado aleatóriamente
        Random NumeroAleatorio = new Random();  // Gerando o número de 1 até 10
        int numero = NumeroAleatorio.nextInt(10) + 1;
        
        int tentativa;

        System.out.println( "Tente adivinhar o número ");
        do{
            tentativa = gerador.nextInt();

    if ( tentativa < numero){
        System.out.println(" O número está mais a cima ");

    } else if ( tentativa > numero){
        System.out.println(" O número está mais a baixo ");

    }

}while( tentativa != numero);

    System.out.println(" Acertou!!! ");

        gerador.close();
    }
}
