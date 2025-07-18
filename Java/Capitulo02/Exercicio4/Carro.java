package Exercicio4;

public class Carro {
    
    String nome;
    int ano;

        public Carro( String nome, int ano){

            this.nome = nome;
            this.ano = ano;
        }

        void ExibirCarro(){

            System.out.println(" O carro" + nome + " foi fabricado no ano de " + ano);
        }
}
