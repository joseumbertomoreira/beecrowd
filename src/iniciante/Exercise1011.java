package iniciante;

import java.util.Scanner;

public class Exercise1011 {

    public static void main(String[] args) {

        double volume, pi = 3.14159, raio;
        Scanner leitura = new Scanner(System.in);

        raio = leitura.nextDouble();

        volume = (4/3.0) * pi * raio*raio*raio;

        System.out.printf("VOLUME = %.3f\n", volume);


    }


}
