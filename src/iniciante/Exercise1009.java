package iniciante;

import java.util.Scanner;

public class Exercise1009 {

    public static void main(String[] args) {

        String nome;
        double salario, salarioFixo, vendas;

        Scanner leitura = new Scanner(System.in);

        nome = leitura.nextLine();
        salarioFixo = leitura.nextDouble();
        vendas = leitura.nextDouble();

        salario = salarioFixo + vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salario);

    }

}
