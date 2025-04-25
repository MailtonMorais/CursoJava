package oo.composicao.aula;


import java.util.ArrayList;

public class Compra {


    String cliente;
    ArrayList<Item1> itens = new ArrayList<Item1>();

    double obterValorTotal(){
        double total = 0;
        for (Item1 item: itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }

}
