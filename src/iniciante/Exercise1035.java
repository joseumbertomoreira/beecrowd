package iniciante;

import java.util.Scanner;

public class Exercise1035 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int A, B, C, D;
        String[] valores;
        String line;
        line = leitura.nextLine();

        valores = line.split(" ");

        A = Integer.parseInt(valores[0]);
        B = Integer.parseInt(valores[1]);
        C = Integer.parseInt(valores[2]);
        D = Integer.parseInt(valores[3]);

        if(B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }



    }

}
