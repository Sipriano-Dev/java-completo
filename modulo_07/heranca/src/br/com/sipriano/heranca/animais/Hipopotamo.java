package br.com.sipriano.heranca.animais;

public class Hipopotamo extends Animal {

    private int forcaMordida;

    //extends precisa chama o construtor da superclasse, onde tá os atributos
    //O atributo nome é fixo pra qualquer obj criado
    //idade é variavel, nesse caso cada um pode ser passado idade diferente
    //Primeiro passe os dados da superclasse, depois o da filha
    public Hipopotamo(int idade, int forcaMordida) {
        super("Hipopótamo", idade);
        this.forcaMordida = forcaMordida;
    }

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
