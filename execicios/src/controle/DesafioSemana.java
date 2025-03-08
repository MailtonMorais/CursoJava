package controle;

import java.util.Scanner;

public class DesafioSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número de 1 á 10 para saber a semana:");
        double dia = entrada.nextDouble();


        //se
        if (dia > 6 || dia <= 0) {
            System.out.println("Número inválido!");
        }
           else {
               if (dia == 1)
            System.out.println("O dia é Domingo!");

               if (dia == 2)
            System.out.println("O dia é Segunda-Feira!");

            if (dia == 3)
                System.out.println("O dia é Terça-Feira!");

            if (dia == 4)
                System.out.println("O dia é Quarta-Feira!");

            if (dia == 5)
                System.out.println("O dia é Quinta-Feira!");

            if (dia == 6)
                System.out.println("O dia é Sexta-Feira!");



        }





        entrada.close();





    }
}
