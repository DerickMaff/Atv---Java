package Atividades5;

import java.util.Scanner;

public class SimuladorDeLogin3 {
    public static void main(String[] agrs ){

        Scanner gerador = new Scanner(System.in);
        String senha = "ca12";
        String Descobri;


        System.out.println(" Digite a senha ");
        do{
            Descobri = gerador.nextLine();

            // 'equals' não comprar apenas os objetos igual o '==', ele compara o conteudo dentro dele também
            if(Descobri.equals(senha) ){
                break;

            }else {
                System.out.println(" Senha invalida!! ");
  
            }

        }while( Descobri != senha );
        System.out.println(" Parabéns, você acertou!! ");

        gerador.close();
    }
}
