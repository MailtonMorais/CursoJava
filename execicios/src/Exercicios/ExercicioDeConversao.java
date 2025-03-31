package Exercicios;

import java.util.Scanner;

public class ExercicioDeConversao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu Primeiro salário:");
        //entrada do salário 1
        String salario1 = (entrada.next().replace(",","."));

        //entrada do salário 2
        System.out.println("Digite seu Segundo salário:");
        String salario2 = (entrada.next().replace(",","."));

        //entrada do salário 3
        System.out.println("Digite seu Terceiro salário:");
        String salario3 = (entrada.next().replace(",","."));

        //Recebe os valores digitados
        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);

         //Soma dos Valores
        double soma = numero1 + numero2 + numero3;
        System.out.println("Total dos 3 meses são: "+ soma);

        //Média dos 3 meses
        System.out.println("Média dos salários é: " + soma / 3);


        entrada.close();


    }
}
