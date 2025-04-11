package br.com.sipriano.heranca.empresa;

public class Main {
    public static void main(String[] args) {

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setCpf("123456789");
        tecnico.setSalario(1500);
        tecnico.imprimirRemuneracao();

        Gerente gerente = new Gerente();
        gerente.setNome("Gerentão");
        gerente.setCpf("043629348");
        gerente.setSalario(3000);
        gerente.imprimirRemuneracao();



    }

}
