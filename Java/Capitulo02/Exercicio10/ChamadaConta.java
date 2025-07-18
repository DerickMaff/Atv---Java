package Exercicio10;

import java.util.Random;
import java.util.Scanner;
public class ChamadaConta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Variavéis 
        String Titular;
        int numConta;

        System.out.print(" Escreva o Titular dessa conta: ");
        Titular = scanner.nextLine();

        numConta = random.nextInt(9999) + 1000;
        
        // Construtor
        Conta conta1 = new Conta(Titular, numConta );
        
        // Método
        conta1.mostrarConta();

        scanner.close();
    }
}
