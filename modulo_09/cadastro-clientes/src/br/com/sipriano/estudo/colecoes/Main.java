package br.com.sipriano.estudo.colecoes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        OrganizacaoClientes cadastro = new OrganizacaoClientes();

        Cliente cliente = new Cliente();
        cliente.setCpf("11111111111");
        cliente.setNome("Android 16");
        cliente.setSexo(TipoSexo.M);

        Cliente cliente2 = new Cliente();
        cliente2.setCpf("22222222222");
        cliente2.setNome("Android 17");
        cliente2.setSexo(TipoSexo.M);

        Cliente cliente3 = new Cliente();
        cliente3.setCpf("33333333333");
        cliente3.setNome("Android 18");
        cliente3.setSexo(TipoSexo.F);

        Cliente cliente4 = new Cliente();
        cliente4.setCpf("44444444444");
        cliente4.setNome("Android 19");
        cliente4.setSexo(TipoSexo.O);

        Cliente cliente5 = new Cliente();
        cliente5.setCpf("55555555555");
        cliente5.setNome("Android 20");
        cliente5.setSexo(TipoSexo.M);

        cadastro.adicionar(cliente);
        cadastro.adicionar(cliente2);
        cadastro.adicionar(cliente3);
        cadastro.adicionar(cliente4);
        cadastro.adicionar(cliente5);

        System.out.println("Femininos: ");
        cadastro.imprimirClientes(TipoSexo.F);
        System.out.println();

        System.out.println("Masculinos: ");
        cadastro.imprimirClientes(TipoSexo.M);
        System.out.println();

        System.out.println("Outros: ");
        cadastro.imprimirClientes(TipoSexo.O);

    }

    private static void exemplosMap() {
        //Não aceita primitivos, só classes, wrapper
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Android 17");
        mapa.put(2, "Android 18");

        String nome = mapa.get(2);

        System.out.println(nome);

        mapa.remove(1);

        System.out.println(mapa.get(1));

        boolean contemChave = mapa.containsKey(1);
        System.out.println("Contem a chave 1: " + contemChave);

        boolean contemValor = mapa.containsValue("Android 18");
        System.out.println("Contem o valor Android 18: " +  contemValor);
    }

    private static void trabalhandoComOrdenacaoDeColecoes() {
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
        //Ou poderia criar um retorno de uma classe Comparator anonima
        //na classe cliente
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
        cliente2.setCpf("953257");
        cliente2.setNome("Android");
        cliente2.setSexo(TipoSexo.M);

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
