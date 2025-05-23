package br.com.sipriano.cadastro_clientes.dados;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

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

    public void atualizar(Cliente cliente) {

        try {

            String comandoSQL = """
                        UPDATE clientes
                        SET nome = ?,
                            sexo = ?,
                            cpf = ?,
                            idade = ?
                        WHERE codigo = ?
                    """;
            PreparedStatement comando = conexao.prepareStatement(comandoSQL);
            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getSexo().name());
            comando.setString(3, cliente.getCpf());
            comando.setInt(4, cliente.getIdade());
            comando.setString(5, cliente.getCodigo().toString());

            comando.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void deletar(UUID codigo) {

        try {

            String comandoSQL = """
                        DELETE FROM clientes WHERE codigo = ?
                    """;
            PreparedStatement comando = conexao.prepareStatement(comandoSQL);
            comando.setString(1, codigo.toString());


            comando.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
