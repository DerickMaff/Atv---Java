package Atividades3;

import java.util.Scanner;

public class RecebimentoScanner {
    public static void main(String[] args){ 

        /* Calculo de um perímetro de um retângulo  */
        Scanner gerador = new Scanner(System.in);

        float base;
        float altura;
        float retangulo;

        System.out.println(" Digite a base e a altura de um retângulo ");

        System.out.println(" Base: ");
        base = gerador.nextFloat();

        System.out.println(" Altura: "); 
        altura = gerador.nextFloat();

        retangulo = 2 * (base + altura); 
        System.out.println(" O perímetro de um retângulo é de " + retangulo);  // Resultado de um perimetro de um retangulo 


        gerador.close(); //Necessario fechar para não dar erro

    }
}
