package iniciante;

import java.util.Scanner;

public class Exercise1019 {

    public static void main(String[] args) {

        int N, horas = 0, minutos = 0, segundos = 0, A = 0;
        Scanner leitura = new Scanner(System.in);

        N = leitura.nextInt();

        if(N / 3600 != 0) {
            horas = N / 3600;
            A = N%3600;
        } else {
            horas = 0;
            A = N;
        }

        if(A / 60 != 0){
            minutos = A / 60;
            segundos = A % 60;
        } else {
            minutos = 0;
            segundos = A;
        }

        System.out.println(horas+":"+minutos+":"+segundos);


    }

}
