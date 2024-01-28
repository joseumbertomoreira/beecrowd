package iniciante;

import java.util.Scanner;
import  java.lang.Math;

public class Exercise1013 {

    public static void main(String[] args) {

        int A, B, C, count, maior;

        Scanner leitura = new Scanner(System.in);

        String valores = leitura.nextLine();
        String[] valoresArray = valores.split(" ");

        A = Integer.parseInt(valoresArray[0]);
        B = Integer.parseInt(valoresArray[1]);
        C = Integer.parseInt(valoresArray[2]);

        count = (A + B + Math.abs((A-B)))/2;
        maior = (count + C + Math.abs((count-C)))/2;

        System.out.printf("%d eh o maior\n", maior);


    }

}
