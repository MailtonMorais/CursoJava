import java.util.Scanner;

public class Temperatura
{
    public static void main(String[] args)
    {
        //Entrada do número em Fahrenheit
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Grau em Fahrenheit:");
        String GrausEmFahrenheit = (entrada.next());


        // Formula para conversão = (F - 32) * 5/9 = C
        int Ajuste = 32;
        double Fatordivisao = 5/9.0;
        double valor = Double.parseDouble((GrausEmFahrenheit));
        int ResultadoFinal = (int) ((valor - Ajuste) * Fatordivisao);

        System.out.println("A conversão em Graus Celsius é " + ResultadoFinal + "ºC");





        entrada.close();
    }
}
