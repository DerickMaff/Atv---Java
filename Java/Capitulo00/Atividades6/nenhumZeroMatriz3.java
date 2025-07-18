package Atividades6;

public class nenhumZeroMatriz3 {
    public static void main( String[] args ){

        int elementos = 0;
        int[][] matriz = { 
            {0, 1, 4, 5, 0, 3},
            {3, 5, 1, 0, 1, 3},
            {0, 3, 7, 4, 0, 5},
            {1, 9, 1, 1, 3, 9},
            {5, 4, 0, 9, 0, 4},
            {1, 1, 6, 5, 5, 3}
        };

        System.out.println(" Matriz:");
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){

                if ( matriz[i][j] != 0){
                    elementos++;
                }

                System.out.print(  matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" Existem " + elementos + " diferentes de 0");

    }
}
