package Exercicios10;

import java.util.Scanner;

public class ExibirConta {
    public static void main(String[] args) {
    
        ContaBancaria escolhas = new ContaBancaria();
        Scanner gerador = new Scanner(System.in);
        
        int opcao;
        float valor;

        System.out.print(" Cadastro: \n - Nome: ");
        escolhas.NomeCliente = gerador.nextLine();

        System.out.print(" - Numero da Conta: ");
        escolhas.NumeroConta = gerador.nextInt();

        
        do{
            // Escolhas para continuar ou não 
            System.out.println(" Selecione: \n 0 - para sair \n 1 - para Depositar \n 2 - para Sacar ");
            opcao = gerador.nextInt();

            // Depositar o valor
            if( opcao == 1 ){
 
                System.out.println(" Que valor deseja depositar? ");
                valor = gerador.nextFloat();

                escolhas.Depositar(valor);
                escolhas.ExibirSaldo();
            }

            // Sacara o valor
            if ( opcao == 2 ){

                System.out.println(" Que valor deseja Sacar? ");
                valor = gerador.nextFloat();

                escolhas.sacar(valor);
                escolhas.ExibirSaldo();
            }

            // Se o número não foi definido como uma escolha
            if ( escolhas.saldo > 3 ){
                    System.out.println(" Número inválido, escolha outro: ");

            }
            
        }while(opcao != 0 );


        escolhas.ExibirTotal();


        gerador.close();
    }
}
