package br.com.sipriano.cadastro_clientes.dominio.enums;

public enum FormaGeometrica {
    QUADRADO(4, "Quadrado"),
    CIRCULO(0, "Circulo"),
    TRIANGULO(3, "Triangulo"),
    RETANGULO(4, "Retangulo");

    private final int lados;
    private final String nome;

    //Não usa public, pois enum não instancia, vai usar construtor interno
    //pra associar o valor aos enums
    FormaGeometrica(int lados, String nome) {
        this.lados = lados;
        this.nome = nome;
    }

    public int getLados() {
        return this.lados;
    }

    public String getNome() {
        return nome;
    }
}
