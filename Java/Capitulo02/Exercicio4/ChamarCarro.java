package Exercicio4;

public class ChamarCarro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro(" 500" , 2020);
        carro1.ExibirCarro();
        
        Carro carro2 = new Carro(" Fusion", 2000);
        carro2.ExibirCarro();

        Carro carro3 = new Carro("Fusca" , 2010);
        carro3.ExibirCarro();
    }
}
