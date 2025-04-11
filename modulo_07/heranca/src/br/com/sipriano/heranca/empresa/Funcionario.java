package br.com.sipriano.heranca.empresa;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public double calcularBonificacao() {
        return (salario / 10) + 50;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirRemuneracao() {
        //Usa o this é opcional pois o java vai usar o metodo de sobrescrita
        double remuneracao = salario + this.calcularBonificacao();
        System.out.println("Remuneração do funcionário " + this.nome + " é: " + remuneracao);
    }

}
