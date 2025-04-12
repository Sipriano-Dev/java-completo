package br.com.sipriano.interfaces;

public interface CarroCombustao {

    void abastecer();

    default void fazAlgo() {
        System.out.println("Fazendo algo...");
    }

}
