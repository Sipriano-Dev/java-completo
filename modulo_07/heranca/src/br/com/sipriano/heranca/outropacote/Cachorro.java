package br.com.sipriano.heranca.outropacote;

import br.com.sipriano.heranca.animais.Animal;

public class Cachorro extends Animal {


    public Cachorro(int idade) {
        super("Cachorro", idade);
    }

    //Consegue acessar o imprimir dados pois é filha de animal
    public void latir() {
        imprimirDados();
    }

}
