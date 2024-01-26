package iniciante;


import java.util.Scanner;

public class Exercise1007 {

    public static void main(String[] args) {

        int A, B, C, D, DIFERENCA;
        Scanner leitura = new Scanner(System.in);

        A = leitura.nextInt();
        B = leitura.nextInt();
        C = leitura.nextInt();
        D = leitura.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);



    }


}
