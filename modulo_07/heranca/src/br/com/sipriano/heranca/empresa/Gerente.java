package br.com.sipriano.heranca.empresa;

public class Gerente extends Funcionario{

    @Override
    public double calcularBonificacaoAnual() {
        return super.getSalario() * 3;
    }

    //Sobrescrita de métodos, usa o mesmo metodo da classe pai
    //e muda a implementação, especializa pra classe filha
    //Sobrescrita tem a mesma assinatura: retorno + nome + parametros
    //Se mudar os parametros, ai é sobrecarga
    @Override
    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();
        double remuneracaoGerente = bonificacaoPadrao + 500;
        return remuneracaoGerente;
    }
}
