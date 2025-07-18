package Exercicio6;

public class Funcionario {
    
    String nome;
    float salario;

    public Funcionario( String nome, float salario){

        this.salario = salario;
        this.nome = nome;

        if( salario > 0){

            System.out.println(" OK ");
        
        }else{

            System.out.println(" O salário está abaixo de 0 !!!");
        }
    }

}
