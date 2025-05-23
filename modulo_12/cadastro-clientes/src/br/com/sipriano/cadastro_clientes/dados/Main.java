package br.com.sipriano.cadastro_clientes.dados;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.sql.SQLException;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws SQLException {

        Cliente cliente = new Cliente();
        cliente.setCodigo(UUID.fromString("8c4bad8b-20be-4b07-971a-f7e994ec99a3"));
        cliente.setNome("Kelly");
        cliente.setSexo(TipoSexo.F);
        cliente.setCpf("55555555555");
        cliente.setIdade(25);

        var conexao = FabricaConexoes.CriarConexao();
        ClienteDAO dao = new ClienteDAO(conexao);

        dao.atualizar(cliente);


        conexao.close();

    }

    private static void exemploInsert() throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setNome("May");
        cliente.setSexo(TipoSexo.F);
        cliente.setCpf("22222222222");
        cliente.setIdade(21);

        var conexao = FabricaConexoes.CriarConexao();
        ClienteDAO dao = new ClienteDAO(conexao);

        dao.inserir(cliente);

        conexao.close();
    }

}
