package Exercicio5;

public class ContaBancaria {
    
    String Titular;
    double saldo;


    public ContaBancaria(){

        this.Titular = " Ana";
        this.saldo = 0;

    }

    void Depositar(double valor){

        saldo +=valor;

    }

    void ExibirSaldo(){

        System.out.println(" O proprietário" + Titular + " tem " + saldo + " de saldo na conta ");
    }
}
