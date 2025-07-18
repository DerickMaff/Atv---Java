package Exercicio5;

import java.util.Scanner;
public class ChamarConta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valor;

        // Construtor já com o Titular e o saldo zerado
        ContaBancaria conta = new ContaBancaria();

        System.out.print(" Deposite o valor desejado: R$");
        valor = scanner.nextDouble();

        // Método
        conta.Depositar(valor);

        // Método
        conta.ExibirSaldo();

        scanner.close();
    }
}
