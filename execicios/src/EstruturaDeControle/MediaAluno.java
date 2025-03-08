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


        if (media >= 6 && media <= 10)
                System.out.print("Aprovado!");

        else if (media <= 5 && media >= 3)

            System.out.print("Recuperação!");

        else
            System.out.println("Reprovado!");
        //estounafeature

        entrada.close();
    }
}
