package iniciante;

import java.util.Scanner;

public class Exercise1020 {

    public static void main(String[] args) {

        int anoEmDias, ano = 0, mes = 0, dias = 0, count = 0;
        Scanner leitura = new Scanner(System.in);

        anoEmDias = leitura.nextInt();

        if(anoEmDias/365 != 0) {

            ano = anoEmDias / 365;
            count = anoEmDias % 365;

        } else {
            ano = 0;
            count = anoEmDias;
        }

        if(count / 30 != 0) {
            mes = count / 30;
            dias = count % 30;
        } else {
            dias = count;
        }


        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");


    }

}
