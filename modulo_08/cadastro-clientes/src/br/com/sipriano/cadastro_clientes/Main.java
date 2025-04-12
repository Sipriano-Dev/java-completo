package br.com.sipriano.cadastro_clientes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println(cliente.getCodigo());
    }
}
