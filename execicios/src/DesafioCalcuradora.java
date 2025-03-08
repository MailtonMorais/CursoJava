import java.util.Scanner;

public class DesafioCalcuradora {

    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);
        //entrada número 01
        System.out.print("Digite primeiro número:");
        double numero1 = Double.parseDouble((entrada.next()));

        //entrada número 02
        System.out.print("Digite segundo número:");
        double numero2 = Double.parseDouble(entrada.next());

        //entrada operação
        System.out.print("Digite a operação:");
        String operacao = (entrada.next());

        //Lógica
        double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
               resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
               resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
               resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
               resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;


        System.out.println("O resultado é; " + resultado);


        entrada.close();


    }
}
