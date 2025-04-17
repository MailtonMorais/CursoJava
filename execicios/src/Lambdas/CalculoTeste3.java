package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {


        Calculo soma = (x, y) -> {
            return  x + y;
        };

        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(2.0, 3.0));

        System.out.println(soma.executar(5, 5));
    }
}
