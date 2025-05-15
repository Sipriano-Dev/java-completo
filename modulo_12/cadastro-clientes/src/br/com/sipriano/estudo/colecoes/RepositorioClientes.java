package br.com.sipriano.estudo.colecoes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;

public class RepositorioClientes {

    private Cliente[] arrayClientes;
    private int posicaoAtual;

    public RepositorioClientes() {
        this.arrayClientes = new Cliente[1000];
        posicaoAtual = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        this.arrayClientes[posicaoAtual] = cliente;
        posicaoAtual++;
    }

    public void imprimirClientes() {
        for (Cliente cliente : arrayClientes)
            System.out.println(cliente);
    }

}
