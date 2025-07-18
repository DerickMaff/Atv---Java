package Atividades8;

import java.util.Scanner;

public class ExpoenteEBase {
    
        public static int CalcularPotencia(int base, int expoente){
            

            // esse '(inr)' é pra tirar do padrão que é o DOUBLE e força para o resultado sair INT  
            int resultado = (int) Math.pow(base, expoente);

            System.out.println(" O resultado de "+ base + " elevado a "+ expoente +" é: "+ resultado );
            return base * expoente;
        }




    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int base;
        int expoente;

        System.out.println(" Escreva a base e o expoente para obter o resultado ");
        
        System.out.print(" Base: ");
        base = scanner.nextInt();

        System.out.print(" Expoente: ");
        expoente = scanner.nextInt();

        
         do{
                System.out.print("Não pode ser negativo, escreva algum outro número : ");
                expoente = scanner.nextInt();

            }while( expoente < 0);
            

        CalcularPotencia(base, expoente);


        scanner.close();
    }
}
