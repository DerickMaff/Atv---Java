package Atividades5;

import java.util.Scanner;

public class SimuladorCaixaMercado2 {
    public static void main(String[] args ){

        Scanner gerador = new Scanner(System.in);
        float compra;
        float acumulador = 0f;
do{

    System.out.println(" Digite quando deu sua compra ");
    compra = gerador.nextFloat();

    System.out.println(" Sua compra é " + compra);
    
    // Acumulando o valor da compra 
    acumulador += compra;

    // enquanto não for '-1' a repetição vai continuar 
}while(compra != -1 );

System.out.println(" Sua compra deu " + acumulador);

    gerador.close();
    }
}
