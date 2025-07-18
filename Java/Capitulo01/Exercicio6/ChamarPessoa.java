package Exercicio6;

public class ChamarPessoa {
    public static void main(String[] args) {

        Pessoa mostrarINFO1 = new Pessoa();
        Pessoa mostrarINFO2 = new Pessoa();

				// Atributos selecionado 
        mostrarINFO1.nome = " Erick";
        mostrarINFO2.nome = " Eliton";

        mostrarINFO1.profissao = " Artista";
        mostrarINFO2.profissao = " Artista de rua ";

        mostrarINFO1.idade =  12;
        mostrarINFO2.idade =  11;

            
            // Método para mostrar tudo
            mostrarINFO1.apresentar();
            
            // Método para mostrar tudo
            mostrarINFO2.apresentar();
    }
}
