package Exercicio3;

public class Aluno {
    
    String nome;
    double nota;

    public Aluno(){}

    public Aluno(String nome , int nota){
        this.nome = nome;
        this.nota = nota;

    }

    void situacao(){

        if( nota >= 6 ){

            System.out.println(" O" + nome + " passou de ano com a nota " + nota );
        
        }else{ 

            System.out.println(" O" + nome + " reprovou de ano com a nota " + nota );
        }

    }
}
