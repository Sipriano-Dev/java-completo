package br.com.sipriano.cadastro_clientes.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

    private static String url = "jdbc:postgresql://localhost:5432/clientes";
    private static String username = "postgres";
    private static String password = "asdf";

    public static Connection CriarConexao() {

        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
