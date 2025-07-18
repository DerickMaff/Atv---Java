package Exercicios9;

import java.util.Scanner;

public class AtenderContatos {
    public static void main(String[] args) {
        
        Scanner gerador = new Scanner(System.in);
        Contato[] contatos = new Contato[5];

        // Para pode adicionar palavras e números ao vetor
        for(int i = 0; i < contatos.length; i++){
            contatos[i] = new Contato();
        }

        // Preenchendo os contatos 
        System.out.println(" Preencha os 5 contatos: ");
        for(int i = 0; i < contatos.length; i++) {

            System.out.println(" Nome: " + (i + 1));
            contatos[i].nome = gerador.nextLine();

            System.out.println(" E-mail: " + (i + 1));
            contatos[i].email = gerador.nextLine();

            System.out.println(" Telefone: " + (i + 1));
            contatos[i].telefone = gerador.nextInt();

            // Consome a quebra de linha após o número
            gerador.nextLine(); 

            contatos[i].chamarContatos();
        }


        gerador.close();
    }
}
