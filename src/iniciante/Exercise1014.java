package iniciante;

import java.util.Scanner;

public class Exercise1014 {

    public static void main(String[] args) {

        int X;
        double distancia, Y;

        Scanner leitura = new Scanner(System.in);
        X = leitura.nextInt();
        Y = leitura.nextDouble();

        distancia = X/Y;

        System.out.printf("%.3f km/l\n", distancia);


    }

}
