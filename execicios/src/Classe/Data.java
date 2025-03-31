package Classe;

public class Data {

    int Dia;
    int Mes;
    int Ano;

    Data() {
        // Dia = 1;
        // Mes = 1;
        // Ano = 1970;

         this(1, 1, 1970);


    }

    Data(int dia, int mes, int ano) {
        this.Dia = dia;
        this.Mes = mes;
        this.Ano = ano;


    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", Dia, Mes, Ano);
    }

}
