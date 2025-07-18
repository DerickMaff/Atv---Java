package Atividades4;

import java.util.Scanner;

public class NatacaoPessoa3 {
    public static void main(String[] args){

        Scanner gerador = new Scanner(System.in);
        int IdadePessoa;

        System.out.println(" Bem vindo ao clube de natação, digite sua idade para ver em qual grupo você se encaixa ");
        IdadePessoa = gerador.nextInt();

        if(IdadePessoa < 5 ){
            System.out.println(" Você não é apto para nadar ");
        
        }else if ( IdadePessoa >= 5 && IdadePessoa <=7 ){
            System.out.println(" Você é Infantil A ");

        } else if ( IdadePessoa >= 8 && IdadePessoa <= 10 ){ 
            System.out.println(" Você é Infantil B ");

        }else if ( IdadePessoa >= 11 && IdadePessoa <= 13 ){
            System.out.println(" Você é Juvenil A ");

        }else if ( IdadePessoa >= 14 && IdadePessoa <= 17 ){
            System.out.println(" Você é Juvenil B");

        }else {
            System.out.println(" Você já é adulto ");
            
        }
        
				 // fechar o Scanner
	       gerador.close();  
    }
}
