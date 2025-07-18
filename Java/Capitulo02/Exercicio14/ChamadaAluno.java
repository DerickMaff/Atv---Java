package Exercicio14;

import java.util.Scanner;
public class ChamadaAluno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nome;
        String nomeCurso;
        String instrutor;
        int cargaHoraria;
        int matricula;

        System.out.println("Você deseja cadastrar esse aluno com um Cuso livre? \n s - sim \n n - não" );
        String escolha = scanner.nextLine();
        
        System.out.print(" Nome: " );
        nome = scanner.nextLine();

        do {

            System.out.print(" Matricula: " );
            matricula = scanner.nextInt();
            
            if( matricula < 10000){

                System.out.println(" Tem que ter no minimo 5 Números !!!!!!");
            }

        }while(matricula < 10000 );


        scanner.nextLine();

        if(escolha.equals("n")){

            System.out.print(" Nome Curso: " );
            nomeCurso = scanner.nextLine();

            System.out.print(" Instrutor: " );
            instrutor = scanner.nextLine();
            
            System.out.print(" Carga horaria: " );
            cargaHoraria = scanner.nextInt();


            System.err.println("|-------Curso-escolhido------|");
            Alunos aluno1 = new Alunos(nome, matricula, nomeCurso, cargaHoraria, instrutor);
            aluno1.exibirFicha();
            System.err.println("|----------------------------|");

        }else{

        System.err.println("|----------Sem-Curso---------|");
            Alunos aluno1 = new Alunos(nome, matricula);
            aluno1.exibirFicha();
        System.err.println("|----------------------------|");

        }
        
        
        scanner.close();
    }
}
