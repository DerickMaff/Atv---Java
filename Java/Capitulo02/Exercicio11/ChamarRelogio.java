package Exercicio11;

import java.util.Scanner;
public class ChamarRelogio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println( " Digite o horário: ");
        
        System.out.print(" Horas: ");
        int valorH = scanner.nextInt();
        
        System.out.print(" Minutos: ");
        int valorM = scanner.nextInt();
        
        System.out.print(" Segundos: ");
        int valorS = scanner.nextInt();
        
        // Construtor
        Relogio relogio1 = new Relogio(valorH, valorM, valorS);
        
        scanner.close();
    }
}
