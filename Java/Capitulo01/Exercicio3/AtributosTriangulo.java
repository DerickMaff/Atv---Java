package Exercicio3;

public class AtributosTriangulo {
    public static void main(String[] args) {
        
        MetodoTrinagulo trianguloCalulos = new MetodoTrinagulo();

        // Declarando com valores as variavei
        trianguloCalulos.altura = 5;
        trianguloCalulos.largura = 5;

        System.out.println(" Resultados"); 

        // Puxando o 1° Método
        trianguloCalulos.CalcularArea();

        // Puxando o 2° Método
        trianguloCalulos.CalcularPerimetro();

    }
}
