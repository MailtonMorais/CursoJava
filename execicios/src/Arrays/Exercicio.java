package Arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunos = new double[4];
        System.out.println(Arrays.toString(notasAlunos));

        notasAlunos[0] = 7.9;
        notasAlunos[1] = 5;
        notasAlunos[2] = 8;
        notasAlunos[3] = 9;

        System.out.println(Arrays.toString(notasAlunos));

        double total = 0;
        for (int i = 0; i < notasAlunos.length; i++) {
            total += notasAlunos[i];
        }
        System.out.println(total / notasAlunos.length);

        double totalAlunoB = 0;
        double[] notasAlunoB = {6.9, 7.1, 5.5, 10};
        for (int i = 0; i <notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];

            System.out.println(totalAlunoB / notasAlunoB.length);

        }



    }

}
