package Atividades4;

import java.util.Scanner;

public class IF_IFelse_ELSE1 {
    public static void main(String[] args){

        /* Informar se o numero é positivo ou negativo 
         *
         * após ele ser conferido, se o valor for positivo multiplique ao
          quadrado, se nao for mostre uma mensagem dizendo que o numero é invalido
         *  
        */

        float ValorEscrito;
        float AoQuadrado;
        Scanner leitor = new Scanner(System.in);

        System.out.println(" Escreva algum número de 0 até 10 ");
        ValorEscrito = leitor.nextFloat();

        if( ValorEscrito >=  0){
        
            AoQuadrado = ValorEscrito * ValorEscrito;
System.out.println(" O valor " + ValorEscrito + " é positivo, então ele ao quadrado é " + AoQuadrado);

        }else {
        
System.out.println(" O valor "+ ValorEscrito + " é inválido");
        }


        leitor.close();  // Obrigado pra não dar erro 
    }
}
