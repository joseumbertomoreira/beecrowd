package iniciante;

import java.util.Scanner;

public class Exercise1015 {

    public static void main(String[] args) {

        double x1 = 0, x2 = 0, y1 = 0, y2 = 0, distancia;
        String ponto;

        Scanner leitura = new Scanner(System.in);
        String[] valores;

        for (int i = 0; i < 2; i++) {
            ponto = leitura.nextLine();

            if(i == 0) {
                valores = ponto.split(" ");
                x1 = Double.parseDouble(valores[0]);
                y1 = Double.parseDouble(valores[1]);
            } else {
                valores = ponto.split(" ");
                x2 = Double.parseDouble(valores[0]);
                y2 = Double.parseDouble(valores[1]);
            }

        }

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);


    }

}
