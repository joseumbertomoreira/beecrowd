package iniciante;

import java.util.Scanner;

public class Exercise1006 {

    public static void main(String[] args) {

        double A = 0, B = 0, C = 0, MEDIA = 0;

        Scanner leitura = new Scanner(System.in);

        A = leitura.nextDouble();
        B = leitura.nextDouble();
        C = leitura.nextDouble();

        MEDIA = (A*2 + B*3 + C*5)/(2+3+5);

        System.out.println("MEDIA = " + MEDIA);


    }

}
