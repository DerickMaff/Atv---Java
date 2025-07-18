package Exercicio7;

public class Calculadora {

    void somar(int a, int b){
        int resultado = a + b;

        System.out.println(" Resultado: ");
        System.out.println( a +" + " + b + " = " + resultado);
    }

    void subtrair(int a, int b){
        int resultado = a - b;

        System.out.println(" Resultado:");
        System.out.println( a +" - " + b + " = " + resultado);
    }

    void multiplicar(int a, int b){
        int resultado = a * b;

        System.out.println(" Resultado: ");
        System.out.println( a +" x " + b + " = " + resultado);
    }

    void dividir(int a, int b){
        int resultado = a / b;

        System.out.println(" Resultado:");
        System.out.println( a +" / " + b + " = " + resultado);
    }
}
