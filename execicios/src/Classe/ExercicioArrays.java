package Classe;

import java.util.Scanner;

public class ExercicioArrays {


    public static void main(String[] args) {

        //entrada das notas
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantas notas serão? ");
        int qtdNotas = entrada.nextInt();


        double[] notas = new double[qtdNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Informe a nota " + (i + 1) + " :");
             notas[i] = entrada.nextDouble();
        }
        double total = 0;
        for (double nota: notas){
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A média do aluno é: " + media + "!");







        entrada.close();
    }

}
