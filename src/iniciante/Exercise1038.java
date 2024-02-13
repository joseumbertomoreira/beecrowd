package iniciante;

import java.util.Scanner;

public class Exercise1038 {

    public static void main(String[] args) {

        int codigo, qtd;
        double total;
        String line;
        Scanner leitura = new Scanner(System.in);

        line = leitura.nextLine();

        String[] valores = line.split(" ");

        codigo = Integer.parseInt(valores[0]);
        qtd = Integer.parseInt(valores[1]);

        switch (codigo) {
            case 1:
                total = qtd * 4.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;

            case 2:
                total = qtd * 4.50;
                System.out.printf("Total: R$ %.2f\n", total);
                break;

            case 3:
                total = qtd * 5.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;

            case 4:
                total = qtd * 2.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;

            case 5:
                total = qtd * 1.50;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
        }



    }

}
