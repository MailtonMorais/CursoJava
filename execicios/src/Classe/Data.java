package Classe;

public class Data {

    int Dia;
    int Mes;
    int Ano;

    Data() {
         Dia = 1;
         Mes = 1;
         Ano = 1970;


    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        Dia = diaInicial;
        Mes = mesInicial;
        Ano = anoInicial;


    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", Dia, Mes, Ano);
    }

}
