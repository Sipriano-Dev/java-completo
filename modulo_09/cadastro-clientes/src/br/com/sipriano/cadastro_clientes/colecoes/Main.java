package br.com.sipriano.cadastro_clientes.colecoes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCpf("0128495");
        cliente.setNome("Android");
        cliente.setSexo(TipoSexo.F);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("953257");
        cliente2.setNome("Android");
        cliente2.setSexo(TipoSexo.M);

        List<Cliente> clientes = Arrays.asList(cliente, cliente2);

        //Method reference
        clientes.sort(Cliente::compareTo);

        //Caso precise cria um especifico sem afetar o que já tem, cria
        //com uma classe anônima, pq o sort espera um comparator de cliente
        //tbm é possivel criar uma classe comparator separada, se for usar em
        //mais situações essa comparação
        clientes.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getCodigo().compareTo(o2.getCodigo());
            }
        });

        for (Cliente c : clientes) {
            System.out.println(c);
        }

    }

    private static void repositorioComSet() {
        //Set não permite repetição e não é ordenado, é tipo uma bolsa de sementes
        //Usa o hash pra comparar e não repetir
        //Treeset não repete e tem ordem predefinida, string = alfabetica,
        // Classe normal, usa o comparable, ou comparator
        Set<String> linguagens = new TreeSet<>();
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
