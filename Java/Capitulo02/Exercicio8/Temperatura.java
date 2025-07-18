package Exercicio8;

public class Temperatura {
    
    float celcius;

    
    public Temperatura(float F){

        this.celcius = (F - 32) * 9/5;

    }

    void ExibirTemperatura(){

        System.out.print(" A temperatura convertida é " + celcius + "°C");
    }

}
