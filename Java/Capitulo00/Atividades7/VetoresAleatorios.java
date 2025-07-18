package Atividades7;

import java.util.Random;

public class VetoresAleatorios {
    public static void main (String[] args){

        Random gerador = new Random();
        int NumeroAleatorio = gerador.nextInt(10) + 1;

        int[] vetor = new int[10];
        int contador = 0;


        System.out.println(" Numero aleatórios ");
       
    
        while(contador < vetor.length ){

                NumeroAleatorio = gerador.nextInt(10) + 1;
                boolean repetido = false;  // Quando for 'true' quer dizer que tem repetição 

            for(int repeticao = 0; repeticao < contador; repeticao++ ){
                    
                if ( vetor[repeticao] == NumeroAleatorio){
                repetido = true;
                break;
                }
            }

            // conferir se tem algum número repetido, se não tiver vai adicionar ao vetor 
            if(!repetido){

                vetor[contador] = NumeroAleatorio;
                System.out.println(" O valor " + vetor[contador] + " fica no vetor " + contador );
                contador++;

            }else{
                System.out.println(" Número repetido: " + NumeroAleatorio);


            }
        }

        System.out.println(" Finalizado!!! ");

    }
}
