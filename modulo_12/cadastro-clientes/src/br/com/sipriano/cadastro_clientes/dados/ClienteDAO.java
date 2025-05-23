package br.com.sipriano.cadastro_clientes.dados;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

//            if (cliente.getIdade() == null) {
//                cliente.setIdade(18);
//            }
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

    public List<Cliente> listar() {

        try {

            String comandoSQL = """
                        SELECT * FROM clientes
                    """;
            PreparedStatement comando = conexao.prepareStatement(comandoSQL);

            ResultSet result = comando.executeQuery();

            List<Cliente> lista = new ArrayList<>();

            while (result.next()) {
                String codigo = result.getString("codigo");
                String nome = result.getString("nome");
                String sexo = result.getString("sexo");
                String cpf = result.getString("cpf");
                Integer idade = result.getInt("idade");

                Cliente cliente = new Cliente();
                cliente.setCodigo(UUID.fromString(codigo));
                cliente.setNome(nome);
                cliente.setSexo(TipoSexo.valueOf(sexo));
                cliente.setCpf(cpf);
                cliente.setIdade(idade);

                lista.add(cliente);
            }

            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
