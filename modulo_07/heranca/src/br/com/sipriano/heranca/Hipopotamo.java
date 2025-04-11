package br.com.sipriano.heranca;

public class Hipopotamo extends Animal {

    private int forcaMordida;

    public int getForcaMordida() {
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }

    public void ficarNaAgua() {
        System.out.println("Estou na água...");
    }

}
