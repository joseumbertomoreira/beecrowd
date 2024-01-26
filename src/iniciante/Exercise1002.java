package iniciante;

import java.util.Scanner;

public class Exercise1002 {

    public static void main(String[] args) {

        double A = 0, pi =  3.14159, raio = 0;
        Scanner leitura = new Scanner(System.in);

        raio = leitura.nextDouble();

        A = pi*raio*raio;

        System.out.printf("A=%.4f%n", A);

    }

}
