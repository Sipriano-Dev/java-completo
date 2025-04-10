package br.com.sipriano;

public class Animal {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void andar() {
        System.out.println("Andando...");
    }

    public void comer() {
        System.out.println("Comendo...");
    }

    public void dormir() {
        System.out.println("ZZZZZZZZ");
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
