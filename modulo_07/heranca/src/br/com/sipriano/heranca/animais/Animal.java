package br.com.sipriano.heranca.animais;

/**
 * public -> visivel em qualquer lugar
 * private -> visivel apenas na propria classe
 * package ou default -> somente dentro do pacote
 * protected -> dentros das classes filhas OU pacote
 */

public class Animal {

    private String nome;
    private int idade;

    //Também afeta os filhos, pra criar tem que ter nome
    //Tem que chamar esse construtor e passa os dados
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    protected void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
