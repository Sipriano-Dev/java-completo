package br.com.sipriano.heranca.empresa;

public class GerenciaRH {

    private ConexaoBancaria conexaoBancaria;

    public GerenciaRH(ConexaoBancaria conexaoBancaria) {
        this.conexaoBancaria = conexaoBancaria;
    }

//    public void pagarBonificacaoAnual(Gerente gerente) {
//        double bonificacaoAnual = gerente.calcularBonificacaoAnual();
//        conexaoBancaria.enviarPagamento(gerente.getCpf(), bonificacaoAnual);
//        enviarEmail();
//    }
//
//    //Sobrecarga de métodos, mesmo nome, assinatura diferente
//    public void pagarBonificacaoAnual(Tecnico tecnico) {
//        double bonificacaoAnual = tecnico.calcularBonificacaoAnual();
//        conexaoBancaria.enviarPagamento(tecnico.getCpf(), bonificacaoAnual);
//    }

    public void pagarBonificacaoAnual(Funcionario funcionario) {
        double bonificacaoAnual = funcionario.calcularBonificacaoAnual();
        conexaoBancaria.enviarPagamento(funcionario.getCpf(), bonificacaoAnual);
        enviarEmail();
    }

    private void enviarEmail() {
        System.out.println("Email enviado");
    }

}
