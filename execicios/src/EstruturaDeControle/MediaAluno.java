package EstruturaDeControle;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        double nota1 = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite a segunda nota:");
        double nota2 = Double.parseDouble(entrada.nextLine());

        System.out.print("Digite a terceira nota:");
        double nota3 = Double.parseDouble(entrada.nextLine());


        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("A Média do aluno é: " + ((int) media));

        boolean aprovado = media >= 6 && media <= 10;
        boolean recuperacao = media <= 5 && media >= 3;
        boolean reprovado = media <= 2;

        if (aprovado)
                System.out.print("Aprovado!");

        if (recuperacao)
        System.out.print("Recuperação!");

        if (reprovado)
            System.out.println("Reprovado!");


        entrada.close();
    }
}
