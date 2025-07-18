package Exercicio13;

public class LivroISBN {

    // A variável static pertence à classe e é compartilhada por todos os objetos da mesma
    // Pode ser acessada diretamente pela classe, como em "LivroISBN.contador"
    static int contador = 0;

    String titulo;
    int isbn;

    public LivroISBN(String titulo){
        this.isbn = ++contador;
        this.titulo = titulo;

        DadosLivros();
    }

    public int getContador(){
        return contador;
    }

    void DadosLivros(){

        System.err.println(" |----------------------------|");
        System.out.println(" |- Titulo do livro: "+ titulo );
        System.out.println(" |- ISBN: "+ isbn);
        System.out.println(" |- Livro N° "+ LivroISBN.contador);
        System.err.println(" |----------------------------|");
        
    }




}