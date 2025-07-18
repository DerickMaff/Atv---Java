package Exercicios10;

public class ContaBancaria {

    String NomeCliente;
    int NumeroConta;
    float saldo;

    void Depositar(double valor){

        saldo += valor;
    }

    void sacar(double valor){

        saldo -= valor;
    }

    void ExibirTotal(){

        System.out.println("|-------------------------------------------------------------------------------------|");
        System.out.println(" Proprietário: " + NomeCliente + "\n Número: " + NumeroConta + "\n Saldo Total: " + saldo);
        System.out.println("|-------------------------------------------------------------------------------------|");

    }

    void ExibirSaldo(){

        System.out.println(" Saldo atual: " + saldo );

    }

}
