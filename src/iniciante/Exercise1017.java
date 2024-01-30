package iniciante;

import java.util.Scanner;

public class Exercise1017 {

    public static void main(String[] args) {

        int kmLt = 12;
        int tempoViagem, vMedia, distancia;
        double litros;

        Scanner leitura = new Scanner(System.in);
        tempoViagem = leitura.nextInt();
        vMedia = leitura.nextInt();

        distancia = tempoViagem * vMedia;

        litros = (double) distancia / kmLt;

        System.out.printf("%.3f\n", litros);



    }

}
