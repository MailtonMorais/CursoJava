package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 2000;
        p1.desconto = 0.1;

        //double precoFinal = p1.preco * (1 - p1.desconto);
        double precoDoGerente = p1.preco * (1 - p1.descontoDoGerente);

        System.out.println("O preço do " + p1.nome + " com desconto é: " + precoDoGerente);

        Produto p2 = new Produto();

        p2.nome = "Teclado";
        p2.preco = 100;
        p2.desconto = 0.30;

        double precoFinal2 = p2.preco * (1 - p2.desconto);
        System.out.println("O preço do " + p2.nome + " com desconto é: " + precoFinal2);
    }
}
