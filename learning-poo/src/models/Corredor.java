package models;

public class Corredor {

    //Um corredor faz atividade, e um ciclista também. Por que são métodos individuais?
    public void fazerAtividade() {
        System.out.println(getNome() + " está correndo na pista de atletismo."); //Ué, um corredor sem nome?
    }

}
