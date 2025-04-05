package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas o aluno tem? ");
        int notas = entrada.nextInt();

        double[] qtdNotas = new double[notas];


        for (int i = 0; i < qtdNotas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + " :");
            qtdNotas[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(qtdNotas));

        double total = 0;
        for (double nota: qtdNotas){
            total += nota;
        }

        double media = total / qtdNotas.length;
        System.out.println("A média do Aluno é: " + media);


        double mediaAluno = total / qtdNotas.length;
        if (mediaAluno >= 6 && mediaAluno <= 10) {
            System.out.println("Aluno passou. Parabéns");
        } else if (mediaAluno == 3 && mediaAluno <= 5) {
            System.out.println("Aluno esta de recuperação");
        } else {
            System.out.println("Aluno esta reprovado!");
        }


        entrada.close();
    }
}
