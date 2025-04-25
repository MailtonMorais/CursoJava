package oo.composicao.aula;

public class CompraTeste {

    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";
        compra1.itens.add(new Item1("Caneta", 20, 7.45));
        compra1.itens.add(new Item1("Borracha", 12, 3.89));
        compra1.itens.add(new Item1("Caderno", 3, 18.79));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }


}
