package Atividades8;

import java.util.Scanner;

public class MaiorDeIdade {
    

    //Função
    public static int VerificarMaioridade(int idade){


        if ( idade >= 18){
            System.out.println(" Você é maior de idade ");

        }else {
            System.out.println(" Você é menor de idade ");
            
        }

        return idade;
    }

    // Main
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println(" Digite sua idade "); 
        idade = scanner.nextInt();

        VerificarMaioridade(idade);

        scanner.close();
    }
}
