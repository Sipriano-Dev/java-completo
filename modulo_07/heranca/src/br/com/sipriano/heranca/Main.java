package br.com.sipriano.heranca;

public class Main {

    public static void main(String[] args) {

        Panda panda = new Panda();
        panda.setNome("Panda");
        panda.setIdade(10);
        panda.imprimirDados();


        Hipopotamo hipopotamo = new Hipopotamo();
        hipopotamo.setNome("Hipopotamo");
        hipopotamo.setIdade(20);
        hipopotamo.imprimirDados();

        Animal animal = new Animal();
        animal.imprimirDados();

    }

}
