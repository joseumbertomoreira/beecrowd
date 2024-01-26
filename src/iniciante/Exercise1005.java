package iniciante;

import java.util.Scanner;

public class Exercise1005 {
    public static void main(String[] args) {

        double A = 0, B = 0, MEDIA = 0;

        Scanner leitura = new Scanner(System.in);

        A = leitura.nextDouble();
        B = leitura.nextDouble();

        MEDIA = (3.5*A + 7.5*B)/(3.5 + 7.5);

        System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}
