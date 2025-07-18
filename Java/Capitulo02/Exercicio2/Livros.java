package Exercicio2;
public class Livros{

    String autor;
    String Titulo;
    public String titulo;

    public Livros(String autor, String Titulo){

        this.autor = autor;
        this.Titulo = Titulo;
    }

    void exibirInformacao(){

        System.out.println(" O livro" + Titulo + " foi escrito por" + autor );
    }


}
