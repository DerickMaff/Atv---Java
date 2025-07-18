package Exercicio6;

import java.util.Scanner;
public class ChamarFuncionario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nome;
        float salario;

        System.out.println("Escreva o nome do funcionario e o quanto ele ganha ");
        System.out.print("- Nome: ");
        nome = scanner.nextLine();

        System.out.print("- Salario: ");
        salario = scanner.nextFloat();

        Funcionario funcionario1 = new Funcionario(nome, salario);

        scanner.close();
    }
}
