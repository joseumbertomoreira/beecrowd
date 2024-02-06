package iniciante;

import java.util.Scanner;

public class Exercise1036 {

    public static void main(String[] args) {

        double A, B, C;
        double R1, R2;

        Scanner leitura = new Scanner(System.in);
        String[] valores;
        String line;
        double delta;

        line = leitura.nextLine();
        valores = line.split(" ");

        A = Double.parseDouble(valores[0]);
        B = Double.parseDouble(valores[1]);
        C = Double.parseDouble(valores[2]);
        delta = (B*B) - 4 * A * C;

        if(delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(delta))/(2 * A);
            R2 = (-B - Math.sqrt(delta))/(2 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);

        }







    }

}
