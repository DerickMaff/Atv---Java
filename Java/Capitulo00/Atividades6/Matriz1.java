package Atividades6;

public class Matriz1 {
    public static void main(String[] args ){

        int[][] numero = {
                            { 1, 2, 3},
                            { 4, 5, 6},
                            { 7, 8, 9}  };


        for(int i = 0; i < numero.length; i++){
            for(int j = 0; j < numero[i].length; j++ ){

                System.out.print( + numero[i][j] + " ");

            }
            //Após imprimir toda a primeira linha vai vir pra essa e vai ser pulada por conta do 'println'
            System.out.println();
        }
    }
}
