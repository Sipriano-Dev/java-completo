package br.com.sipriano.cadastro_clientes.dados;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Data Access Object
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserir(Cliente cliente) {

        try {
            String comandoSQL = """
                    INSERT INTO clientes (codigo, nome, sexo, cpf, idade)
                    VALUES (?, ?, ?, ?, ?)
                    """;
            PreparedStatement comando = conexao.prepareStatement(comandoSQL);
            comando.setString(1, cliente.getCodigo().toString());
            comando.setString(2, cliente.getNome());
            comando.setString(3, cliente.getSexo().name());
            comando.setString(4, cliente.getCpf());
            comando.setInt(5, cliente.getIdade());

            comando.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
