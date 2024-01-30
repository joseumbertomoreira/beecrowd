package iniciante;

import java.util.Scanner;

public class Exercise1016 {

    public static void main(String[] args) {

        double X = 60, Y = 90, velocidadeR, distancia;
        double tempo;

        Scanner leitura = new Scanner(System.in);
        distancia = leitura.nextInt();

        velocidadeR = Y - X;
        tempo = 60*(distancia/velocidadeR);

        System.out.printf("%.0f minutos\n", tempo);


    }

}
