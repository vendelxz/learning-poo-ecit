package models;

public class Ciclista extends Atleta {

    public Ciclista(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void fazerAtividade() {
        System.out.println("O ciclista " + getNome() + " está pedalando a sua bicicleta.");
    }
}