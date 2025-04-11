package br.com.sipriano.outropacote;

import br.com.sipriano.heranca.Animal;

public class Cachorro extends Animal {

    //Consegue acessar o imprimir dados pois é filha de animal
    public void latir() {
        imprimirDados();
    }

}
