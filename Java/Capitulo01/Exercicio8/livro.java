package Exercicio8;

public class livro {
    public static void main(String[] args) {
     
        // Criando um vetor para armazenamento
        LivrosArray[] livro1 =  new LivrosArray[3];
        
        // Inicializando os objetos do vetor para poder usar  (É possível fazer isso com laço de repetição pra ser mais facil)
        livro1[0] = new LivrosArray();
        livro1[1] = new LivrosArray();
        livro1[2] = new LivrosArray();

        // Nomeando os vetores 
        livro1[0].autor = "Erick";
        livro1[0].titulo = "Pé de feijão";
        
        livro1[1].autor = "Eliton";
        livro1[1].titulo = "Ornitorrinco";
        
        livro1[2].autor = "Ana";
        livro1[2].titulo = "Olaf";

        // Colocando os vetores para aparecer
        for(int i = 0; i < 3; i++){
            
            System.out.println(" Informações dos livros: ");
            livro1[1].exibirInformacoes();

        }

    }
}