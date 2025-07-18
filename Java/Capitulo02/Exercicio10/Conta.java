package Exercicio10;

public class Conta {

    String Titular;
    int numeroConta;

    public Conta(String Titular, int numeroConta){

        this.Titular = Titular;
        this.numeroConta = numeroConta;
    }

    void mostrarConta(){

        System.out.println("|---------------------------------|");
        System.out.println( " - Dono da conta: " + Titular + "\n - Número da conta: " + numeroConta);
        System.out.println("|---------------------------------|");
        
    }
    
}
