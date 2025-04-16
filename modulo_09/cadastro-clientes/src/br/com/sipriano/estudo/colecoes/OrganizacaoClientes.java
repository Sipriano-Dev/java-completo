package br.com.sipriano.estudo.colecoes;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.*;

public class OrganizacaoClientes {

    Map<TipoSexo, List<Cliente>> mapa;

    public OrganizacaoClientes() {
        this.mapa = new HashMap<>();
    }

    public void adicionar(Cliente cliente) {
        boolean contemSexo = mapa.containsKey(cliente.getSexo());

        if (contemSexo) {
            List<Cliente> clientes = mapa.get(cliente.getSexo());
            clientes.add(cliente);
        } else {
            List<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente);
            mapa.put(cliente.getSexo(), clientes);
        }
    }

    public List<Cliente> buscarPorSexo(TipoSexo tipo) {
        return mapa.get(tipo);
    }

    public List<TipoSexo> obterTiposAdicionados() {
        Set<TipoSexo> tipoSexos = mapa.keySet();
        //Retorna uma lista usando o construtor que converte set to list
        return new ArrayList<>(tipoSexos);
    }

    public void imprimirClientes(TipoSexo tipo) {
        List<Cliente> clientes = mapa.get(tipo);
        if (clientes != null) for (Cliente c : clientes) System.out.println(c.getNome());
        else System.out.println("Lista vazia");
        //Esse if evita nullpointerexception
        //if, for e else todos sem chaves pois contem só uma linha cada



    }

}
