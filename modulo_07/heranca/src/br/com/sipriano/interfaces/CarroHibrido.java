package br.com.sipriano.interfaces;

public class CarroHibrido implements CarroEletrico, CarroCombustao{

    @Override
    public void abastecer() {

    }

    @Override
    public void carregarBateria() {

    }

    //Se tiver o mesmo metodo nas duas interfaces, vc tem que sobrescrever o metodo
    //abaixo é a forma como escolhe qual implementação vai usar
    @Override
    public void fazAlgo() {
        CarroEletrico.super.fazAlgo();
    }
}
