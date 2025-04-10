package carros;

public class Carro {

    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitro;

    void abastecer(int litros) {
        int capacidadeAtual = capacidadeTanque - combustivel;
        if (litros >= capacidadeAtual) {
            System.out.println("Foi abastecido somente a capacidade do tanque : " + capacidadeTanque);
            System.out.println("Abastecido: " + capacidadeAtual);
            System.out.println("Sobrou: " + (litros - capacidadeAtual));
            litros = capacidadeAtual;
        }
        combustivel += litros;

    }

    int autonomiaCombustivel() {
        int autonomia = combustivel * kmPorLitro;
        return autonomia;
    }

}
