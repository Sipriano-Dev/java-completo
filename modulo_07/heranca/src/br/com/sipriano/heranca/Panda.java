package br.com.sipriano.heranca;

public class Panda extends Animal {

    private String corPrimaria;
    private String corSecundaria;

    public Panda(int idade) {
        super("Panda", idade);
    }

    public String getCorPrimaria() {
        return corPrimaria;
    }

    public void setCorPrimaria(String corPrimaria) {
        this.corPrimaria = corPrimaria;
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }

    public void subirArvore() {
        System.out.println("Subindo...");
    }

}
