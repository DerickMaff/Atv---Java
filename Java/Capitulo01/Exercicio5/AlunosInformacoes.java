package Exercicio5;

import java.util.Scanner;

public class AlunosInformacoes {
    public static void main(String[] args) {
        

        Scanner gerador = new Scanner(System.in);
        Alunos informacao = new Alunos();

        System.out.println(" Digite o nome do aluno ");
        informacao.nome = gerador.nextLine();

        System.out.println(" Digite a idade dele ");
        informacao.idade = gerador.nextInt();

        System.out.println(" Digite a nota final desse aluno");
        informacao.nota = gerador.nextFloat();

        
        // Puxando o Método para as informações que o usuário esceveu aparecer aqui 
        informacao.mostrarDados();

        gerador.close();
    }
}
