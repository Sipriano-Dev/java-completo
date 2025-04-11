package br.com.sipriano.heranca.outropacote;

public class Main {
    public static void main(String[] args) {

        //Não consegue acessar imprimir dados daqui, pois main não é filha de animal
        Cachorro cachorro = new Cachorro(5);

        //Latir usa imprimir dados internamente
        cachorro.latir();

    }

}
