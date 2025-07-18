package Atividades3;

import java.util.Scanner;

public class RecebimentoScanner2 {
    public static void main(String[] args){ 

        /* Pedir um valor em 'Float' como se fosse em R$, e imprimir 10% a mais */
        Scanner gerador = new Scanner(System.in);

        float dinheiro;
        float porcentagem = 10;

        System.out.println("Digie um numero para ter um aumento de 10% ");
        dinheiro = gerador.nextFloat();
        
        float resultado = dinheiro + (dinheiro * (porcentagem/100));
        
			  // Resultado dos 10% a mais do salário do michel 
        System.out.println(" O valor com o aumento de 10% fica "+ resultado);

        gerador.close(); //Necessario fechar para não dar erro

    }
}
