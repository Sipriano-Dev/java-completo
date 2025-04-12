package br.com.sipriano.heranca.empresa;

//Não instancia mais, os filhos tem que implementar os metodos abstratos
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //Nunca pode ser privado, pra permitir a implementação
    //Metodos abstratos só podem em classes abstratas
    //Precisa ser implementado na subclasse
    public abstract double calcularBonificacaoAnual();

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
