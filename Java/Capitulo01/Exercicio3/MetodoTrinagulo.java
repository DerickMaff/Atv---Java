package Exercicio3;

public class MetodoTrinagulo {

    // Atributos
    float altura;
    float largura;

    // Primeiro Método sendo criado para ser puaxado
    void CalcularArea(){

        float area = altura * largura;
        System.out.println(" A Area do retângulo é de "+ area );

    }
    // Segundo Método
    void CalcularPerimetro(){

        float perimetro = 2 * (altura + largura );
        System.out.println(" O Perímetro do retângulo é de: " + perimetro );

    }


}
