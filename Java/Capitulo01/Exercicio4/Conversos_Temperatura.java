package Exercicio4;


public class Conversos_Temperatura {


    float Celcios;
    float Fahrenheit;

    void celsiusParaFahrenheit(double Celcios){
    double resultadoFahrenheit = ( Celcios * 9/5 ) + 32;

        System.out.println(" O resultado em °F: " + resultadoFahrenheit );

    }

    void fahrenheitParaCelsius(double Fahrenheit){
        double resultadoCelcios = (Fahrenheit - 32) * 9/5;
        
        System.out.println(" O resultado de  °C " + resultadoCelcios);
        
    }
    
}
