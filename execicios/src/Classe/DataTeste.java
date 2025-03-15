package Classe;

import javax.xml.transform.Source;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(31, 12,2024);


        Data d2 = new Data();


        System.out.println("A data é: " + d1.obterDataFormatada());

        System.out.println("A data é: " + d2.obterDataFormatada());
    }
}
