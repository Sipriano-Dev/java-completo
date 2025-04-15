package br.com.sipriano.cadastro_clientes.colecoes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        Cliente cliente = new Cliente();
        cliente.setCpf("0128495");
        cliente.setNome("Android 18");
        cliente.setSexo(TipoSexo.F);

        Cliente cliente2 = new Cliente();
        cliente.setCpf("953257");
        cliente.setNome("Android 12");
        cliente.setSexo(TipoSexo.M);

        clientes.add(cliente);
        clientes.add(cliente2);

        System.out.println(clientes.size());

        for (Cliente c : clientes) {
            System.out.println(c);
        }

    }

    private static void repositorioComArray() {
        RepositorioClientes repositorioClientes = new RepositorioClientes();

        Cliente cliente = new Cliente();
        cliente.setCpf("0128495");
        cliente.setNome("Android 18");
        cliente.setSexo(TipoSexo.F);

        repositorioClientes.adicionarCliente(cliente);
        repositorioClientes.imprimirClientes();
    }
}
