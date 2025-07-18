package Exercicio14;

public class Alunos {
    
    String nome;
    int matricula;
    Curso curso1;


    public Alunos(String nome, int matricula, String nomeCurso, int cargaHoraria, String instrutor){

        this.nome = nome;
        this.matricula = matricula;

        this.curso1 = new Curso( nomeCurso, cargaHoraria, instrutor);

    }

    public Alunos(String nome, int matricula){

        
        this.nome = nome;
        this.matricula = matricula;

        this.curso1 = new Curso("Curso Livre" , 0, " Ausente");


    }

    void exibirFicha(){

        System.out.println(" Aluno: " + nome);
        System.out.println(" Matricula: " + matricula);
        System.out.println(" Curso: " + curso1.nomeCurso);
        System.out.println(" Carga Horaria: " + curso1.cargaHoraria);
        System.out.println(" Instrutor: " + curso1.instrutor);

    }

    
    
}
