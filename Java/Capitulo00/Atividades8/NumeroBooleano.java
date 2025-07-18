package Atividades8;

import java.util.Scanner;

public class NumeroBooleano {

    // Agora retorna um booleano
    public static boolean ehPositivo(int valor) {

        if (valor > 0) {
            System.out.println("Número positivo");
            return true;
        } else {
            System.out.println("Número negativo");
            return false;
            
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        boolean possibilidade;

        do {
            System.out.print("Digite algum valor: ");
            valor = scanner.nextInt();

            // Atualiza a variável com o retorno da função
            possibilidade = ehPositivo(valor);

        } while (!possibilidade); // Repete enquanto for falso (número negativo)

        scanner.close();
    }
}
