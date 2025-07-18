package Exercicio2;

public class Livros{

    String autor;
    String titulo;

    public Livros(String autor, String titulo){

        this.autor = autor;
        this.titulo = titulo;
        exibirInformacoes();
    }

    public void exibirInformacoes(){

        System.out.println(" O nome do livro é " + titulo + " escrito pelo " + autor);

    }


}
