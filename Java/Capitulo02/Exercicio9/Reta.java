package Exercicio9;

public class Reta {
    
    Ponto pontoA;
    Ponto pontoB;

    public Reta( Ponto ponto1 , Ponto ponto2 ){

        this.pontoA = ponto1;

        this.pontoB = ponto2;
    }

    void MostrarCordenadas(){

        // Acessando os atributos da Classe "Ponto" e escolhendo qual será usada  
        System.out.println(" Ponto A: ("+ pontoA.x + "," + pontoB.y + ") , Ponto B: ("+ pontoB.x + "," + pontoB.y + ")" );
    }

}
