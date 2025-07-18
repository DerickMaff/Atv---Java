package Atividades7;

import java.util.Scanner;

public class NotasAlunosCinco2 {
    public static void main( String[] args){

        Scanner gerador = new Scanner(System.in);
        float[] ArmazemNotas = new float[5];
        float notasDigitadas;
        int contador = 0;

        System.out.println(" digite 5 notas de alunos");


        for(int repeticao = 0; repeticao < 5; repeticao++){
            notasDigitadas = gerador.nextFloat();
            
            ArmazemNotas[repeticao] = notasDigitadas;

            if(ArmazemNotas[repeticao] >= 7){
                System.out.println(" O aluno " + (repeticao + 1) + " passou com " + ArmazemNotas[repeticao]);
                contador++;

            }else{
                System.out.println(" O aluno " + (repeticao + 1)  +" reprovou ");

            }

        }

        System.out.println(" Foram um total de " + contador + " que passaram de ano");

        gerador.close();
    }
}
