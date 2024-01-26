package iniciante;

import java.util.Scanner;

public class Exercise1008 {

    public static void main(String[] args) {

        int numeroFuncionario, horasTrabalhadas;
        double salario, valorHoraTrabalhada;

        Scanner leitura = new Scanner(System.in);

        numeroFuncionario = leitura.nextInt();
        horasTrabalhadas = leitura.nextInt();
        valorHoraTrabalhada = leitura.nextDouble();

        salario = horasTrabalhadas * valorHoraTrabalhada;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}
