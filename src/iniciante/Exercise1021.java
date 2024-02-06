package iniciante;

import java.util.Scanner;

public class Exercise1021 {

    public static void main(String[] args) {

        double valorInicial, valor, nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        int moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda1 = 0;
        Scanner leitura = new Scanner(System.in);

        valor = leitura.nextDouble();

        if((valor / 100) != 0) {
            nota100 = (int) valor / 100;
            valor = valor % 100;
        }


        if((valor / 50) != 0) {
            nota50 = (int) valor / 50;
            valor = valor % 50;
        }

        if((valor / 20) != 0) {
            nota20 = (int) valor / 20;
            valor = valor % 20;
        }

        if((valor / 10) != 0) {
            nota10 = (int) valor / 10;
            valor = valor % 10;
        }

        if((valor / 5) != 0) {
            nota5 = (int) valor / 5;
            valor = valor % 5;
        }

        if((valor / 2) != 0) {
            nota2 = (int) valor / 2;
            valor = valor % 2;
        }

        if((valor / 1) != 0) {
            nota1 = (int) valor / 1;
            valor = valor % 1;
        }

        valor = (int) (valor * 100);

        if((valor / 50) != 0) {
            moeda50 = (int) valor / 50;
            valor = (int) valor % 50;
        }

        if((valor / 25) != 0) {
            moeda25 = (int) valor / 25;
            valor = (int) valor % 25;
        }

        if((valor / 10) != 0) {
            moeda10 = (int) valor / 10;
            valor = (int) valor % 10;
        }

        if((valor / 5) != 0) {
            moeda5 = (int) valor / 5;
            valor = (int) valor % 5;
        }

        if((valor / 1) != 0) {
            moeda1 = (int) valor / 1;
            valor = (int) valor % 1;
        }

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", (int) nota100);
        System.out.printf("%d nota(s) de R$ 50.00\n", (int) nota50);
        System.out.printf("%d nota(s) de R$ 20.00\n", (int) nota20);
        System.out.printf("%d nota(s) de R$ 10.00\n", (int) nota10);
        System.out.printf("%d nota(s) de R$ 5.00\n", (int) nota5);
        System.out.printf("%d nota(s) de R$ 2.00\n", (int) nota2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", (int) nota1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moeda50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moeda25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moeda10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moeda5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moeda1);




    }

}
