package Atividades4;

import java.util.Scanner;

public class NotaAluno2 {
    public static void main(String[] args ){

        
        Scanner gerador = new Scanner(System.in);
        float nota;
        float presenca;
        float calculoFalta;
        float porcetagem = 25;

        System.out.println(" Digite sua nota ");
        nota = gerador.nextFloat();

        System.out.println(" Agora digite qunatas faltas você tem ");
        presenca = gerador.nextFloat();

        //Fazendo o calculo para pegar a porcentagem de aulos total do ano
        calculoFalta =  200 * ( porcetagem/100);

        // Conferir 
        if( nota >= 7 && presenca <= calculoFalta){

        System.out.println(" Parabens Você passou " );

        }else { 
            System.out.println(" Você reprovou ");
        }


        gerador.close();
    }
}
