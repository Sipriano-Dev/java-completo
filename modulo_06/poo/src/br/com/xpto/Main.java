package br.com.xpto;


public class Main {

    public static void main(String[] args) {

        //Forma de pegar classe com mesmo nome de pacotes diferentes, usando assinatura do pacote
        br.com.xpto.concessionaria.Pessoa pessoaConcessionaria = new br.com.xpto.concessionaria.Pessoa();
        String rg = pessoaConcessionaria.getRg();

        br.com.xpto.sistemabancario.Pessoa pessoaSistemaBancario = new br.com.xpto.sistemabancario.Pessoa();
        String cpf = pessoaSistemaBancario.getCpf();

    }

}
