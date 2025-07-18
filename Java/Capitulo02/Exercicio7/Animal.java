package Exercicio7;

public class Animal {
    
    String nome;

    public Animal(){

        this.nome = " Desconhecido";
    }

    public Animal(String nome){

        this.nome = nome;
    }

    void ExibirAnimal(){

        System.out.println(" O Animal é: " + nome);
    }

}
