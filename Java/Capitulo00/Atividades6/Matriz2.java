package Atividades6;

import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args){


        Scanner gerador = new Scanner(System.in);
        int linhas;
        int colunas;

        System.out.println(" Digite o numero de linhas");
        linhas = gerador.nextInt();

        System.out.println(" Digite o numero de colunas ");
        colunas = gerador.nextInt();

        int[][] Matriz = new int[linhas][colunas]; 


        
        // Preencher a Matriz 
        for(int i = 0; i < linhas; i++){
            for( int j = 0; j < colunas; j++ ){

                System.out.print(" Elementos: "+ "[" + i + "] [" + j + "]: ");
                Matriz[i][j] = gerador.nextInt(); 
 
            }
        }

        // com o preenchimento já
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++ ){

                System.out.print( Matriz[i][j] + " ");

            }
            System.out.println();
        }

        // Criando a variavel 'Matriz' pra ser usado depois e conferir qual é o maior e menor
        int maiorNumero = Matriz[0][0];
        int menorNumeor = Matriz[0][0];

    
            System.out.println(" O maior número é " + maiorNumero);
            System.out.println(" O menor número é " + menorNumeor);


        gerador.close();
    }
}
