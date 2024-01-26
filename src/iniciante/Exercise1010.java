package iniciante;

import java.util.Scanner;

public class Exercise1010 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double valorPagar = 0;

        for (int i = 0; i < 2; i++) {
            String inputLine = leitura.nextLine();

            String[] valores = inputLine.split(" ");

            int codigo = Integer.parseInt(valores[0]);
            int numeroPecas = Integer.parseInt(valores[1]);
            double valorUnitario = Double.parseDouble(valores[2]);

            valorPagar += valorUnitario * numeroPecas;


        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);

    }

}
