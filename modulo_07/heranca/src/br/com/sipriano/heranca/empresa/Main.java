package br.com.sipriano.heranca.empresa;

public class Main {
    public static void main(String[] args) {

        Funcionario tecnico = new Tecnico();
        tecnico.setNome("Fulano");
        tecnico.setCpf("123456789");
        tecnico.setSalario(1500);
        tecnico.imprimirRemuneracao();

        Funcionario gerente = new Gerente();
        gerente.setNome("Gerentão");
        gerente.setCpf("043629348");
        gerente.setSalario(3000);
        gerente.imprimirRemuneracao();

        System.out.println("----------------");
        System.out.println("Bonus anual");
        System.out.println("Gerente: " + gerente.calcularBonificacaoAnual());
        System.out.println("Tecnico: " + tecnico.calcularBonificacaoAnual());

        System.out.println("----------------");
        ConexaoBancaria conexaoBancaria = new ConexaoBancaria();
        GerenciaRH gerenciaRH = new GerenciaRH(conexaoBancaria);
        gerenciaRH.pagarBonificacaoAnual(gerente);
        gerenciaRH.pagarBonificacaoAnual(tecnico);


    }

}
