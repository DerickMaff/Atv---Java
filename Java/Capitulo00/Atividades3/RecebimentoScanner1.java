package Atividades3;

import java.util.Scanner;

public class RecebimentoScanner1 {
    public static void main(String[] args){ 

        /* Pedir para o usuario escrever um numero e imprimir o dobro */

        int numero;
        Scanner gerador = new Scanner(System.in);  //Padrão para o sistem entender que o sinal vem do teclado 

        System.out.println(" Digite um numero ");
        numero = gerador.nextInt();

        int dobro = numero * 2;  // Obtendo o dobro do numero digitado pelo usuario 
        System.out.println(" O dobro de " + numero + " é " + dobro);


        gerador.close(); //Necessario fechar para não dar erro

    }
}
