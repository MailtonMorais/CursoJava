package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDoAdivinheUmNumero {

    public static void main(String[] args) {
        //ENTRADA TECLADO
        Scanner teclado = new Scanner(System.in);
        //NÚMERO GERADO ALEATORIO
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);

        //LOGICA
        //VARIAVEL DO USUARIO
        int numeroUsuario = 0;
        //VARIAVEL DAS TENTATIVAS
        int tentativas = 0;
        //LAÇO DE REPETIÇÃO
        while (numeroUsuario != numeroAleatorio) {
            System.out.print("Adivinhe o número da sequência de 1 a 100: ");
            numeroUsuario = teclado.nextInt();
            tentativas++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns você acertou!!!");
            } else if (numeroAleatorio < numeroUsuario) {
                    System.out.println("O número é menor");
            }
            else{
                System.out.println("O número é maior");
            }
        }
        //TELA FINAL COM TENTATIVAS
        System.out.println("Tentativas " + tentativas);
        teclado.close();
    }
}