package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro outlander = new Carro();
        System.out.println(outlander.estaligado());

        outlander.ligar();
        System.out.println(outlander.estaligado());

        System.out.println(outlander.motor.giros());

        outlander.acelerar();
        outlander.acelerar();
        outlander.acelerar();
        outlander.acelerar();

        System.out.println(outlander.motor.giros());

        outlander.frear();
        outlander.frear();
        outlander.frear();
        outlander.frear();
        outlander.frear();
        outlander.frear();
        outlander.frear();
        outlander.frear();

        System.out.println(outlander.motor.giros());


    }
}
