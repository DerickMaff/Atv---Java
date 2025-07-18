package Exercicio12;

public class LivroSobrecarga {
    
    String titulo;
    String autor;
    int ano;

    public LivroSobrecarga(String titulo, String autor, int ano ){
        
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        System.err.println("|----------------------------|");
        Dados();
        System.err.println("|----------------------------|");
    }

    
    public LivroSobrecarga(String titulo, String autor ){
        
        this.titulo = titulo;
        this.autor = autor;
        ano = 2020;
        System.err.println("|----------------------------|");
        Dados();
        System.err.println("|----------------------------|");
    }

    void Dados(){

        System.out.println("- Titulo: " + titulo + "\n- Livro: " + autor + "\n- Ano de publicação: " + ano);
    }

}
