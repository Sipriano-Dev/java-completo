package br.com.sipriano.interfaces;

public interface CarroEletrico {

    int VELOCIDADE_MAXIMA = 150;

    void carregarBateria();

    //Além do padrão abstrato, tbm pode usar metodos staticos
    static void imprimirAlgo() {
        System.out.println("Imprimindo algo...");
    }

    //Esse default não é modificador de acesso e sim um metodo
    //padrão a todas as instancias
    default void fazAlgo() {
        System.out.println("Fazendo algo...");
    }

}
