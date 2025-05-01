package br.com.sipriano.cadastro_clientes.dominio.enums;

public class Geometria {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica = FormaGeometrica.CIRCULO;
        int lados = formaGeometrica.getLados();
        String nome = formaGeometrica.getNome();

        System.out.printf("O %s tem %d lados", nome, lados);

    }

}
