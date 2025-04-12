package br.com.sipriano.heranca.empresa;

public class Tecnico extends Funcionario{

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double calcularBonificacaoAnual() {
        //Super não é necessário aqui, pois Tecnico não tem um getSalario
        //dai vai usar o da classe pai sem o super, se tive sua propria
        //implementação, dai seria necessário, ou poderia usa o this para
        //referenciar a implementação dessa
        return super.getSalario() * 2;
    }
}
