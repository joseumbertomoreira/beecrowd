package iniciante;

import java.util.Scanner;

public class Exercise1004 {
    public static void main(String[] args) {
        int A = 0, B = 0, PROD = 0;

        Scanner leitura = new Scanner(System.in);

        A = leitura.nextInt();
        B = leitura.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

    }
}
