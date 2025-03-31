package Classe;

public class Pessoa {

    String nome;
    double peso;



    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

   void comer(ComidaBoa comida) {
       if (comida != null) {
          this.peso += comida.peso;
       }


   }
    String apresentar(){
        return String.format("Eu me chamo " + nome + " e tenho " + peso + "Kgs.");
    }
}