package models;

public class Corredor extends Atleta {

    public Corredor(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void fazerAtividade() {
        System.out.println("O corredor " + getNome() + " está correndo na pista de atletismo.");
    }
}