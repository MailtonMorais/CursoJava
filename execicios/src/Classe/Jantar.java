package Classe;

public class Jantar {
    public static void main(String[] args) {

        ComidaBoa c1 = new ComidaBoa("Arroz", 0.300);
        ComidaBoa c2 = new ComidaBoa("Feijão", 0.500);

        Pessoa p1 = new Pessoa("João", 60);
        System.out.println(p1.apresentar());

        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());



    }
}
