package iniciante;

import java.util.Scanner;

public class Exercise1012 {

    public static void main(String[] args) {

        double A, B, C, areaTrianguloRetangulo, pi = 3.14159, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Scanner leitura = new Scanner(System.in);

        String valores = leitura.nextLine();
        String[] valoresArray = valores.split(" ");

        A = Double.parseDouble(valoresArray[0]);
        B = Double.parseDouble(valoresArray[1]);
        C = Double.parseDouble(valoresArray[2]);

        areaTrianguloRetangulo = (A * C)/2;
        areaCirculo = pi*C*C;
        areaTrapezio = ((A + B)*C)/2;
        areaQuadrado = B*B;
        areaRetangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

    }

}
