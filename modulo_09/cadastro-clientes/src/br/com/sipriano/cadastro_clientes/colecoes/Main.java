package br.com.sipriano.cadastro_clientes.colecoes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        //Set não permite repetição e não é ordenado, é tipo uma bolsa de sementes
        //Usa o hash pra comparar e não repetir
        //Treeset não repete e tem ordem predefinida, string = alfabetica,
        // Classe normal, usa o comparable, ou comparator
        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("Java");

        for (String l : linguagens) {
            System.out.println(l);
        }
    }

    private static void repositorioComList() {
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

        //Usa o equals implementado na classe pra ver se é igual
        boolean contem = clientes.contains(cliente2);
        System.out.println(contem);

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
