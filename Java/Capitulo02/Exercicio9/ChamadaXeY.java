package Exercicio9;

public class ChamadaXeY {
    public static void main(String[] args) {
        

        Ponto ponto1 = new Ponto(4, 5);
        Ponto ponto2 = new Ponto(1, 2);

        Reta pontosJuntos = new Reta(ponto1 , ponto2);
        pontosJuntos.MostrarCordenadas();


    }
}
 