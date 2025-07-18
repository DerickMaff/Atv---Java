package Exercicio12;

import java.util.Scanner;
public class ChamarLivroSobrecarga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String titulo;
        String autor;
        int ano;

        // 1° Pessoa
        System.out.println(" Digite Sobre o livro");
        System.out.println(" Pessoa 1: ");
        System.out.print("- Titulo: ");
        titulo = scanner.nextLine();
        
        System.out.print("- Autor: ");
        autor = scanner.nextLine();

        System.out.print("- Ano de publicação: ");
        ano = scanner.nextInt();

        scanner.nextLine();
        LivroSobrecarga livro1 = new LivroSobrecarga(titulo, autor, ano);


        // 2° Pessoa
        System.out.println(" Pessoa 2: ");
        System.out.print("- Titulo: ");
        titulo = scanner.nextLine();
        
        System.out.print("- Autor: ");
        autor = scanner.nextLine();

        LivroSobrecarga livro2 = new LivroSobrecarga(titulo, autor);
        

        scanner.close();
    }
}
