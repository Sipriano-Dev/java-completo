package br.com.sipriano.cadastro_clientes.dados;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

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
