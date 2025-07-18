package Exercicio11;

public class Relogio {
    
    int hora;
    int minutos;
    int segundos;

    Relogio( int hora, int minutos, int segundos){

        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

        if( this.hora <= 23 && this.minutos <= 59 && this.segundos <= 59){

            mostrarHora();
        }else{

            System.err.println(" ERRO");
        }

    }

    void mostrarHora(){

        System.out.format("Horario:  %d / %d / %d ", hora, minutos, segundos );
    }

}
