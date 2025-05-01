package br.com.sipriano.cadastro_clientes.utilitarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenciadorArquivos {

    public static final String pastaFotos = "D:\\extras\\java_completo\\";

    public static void persistirArquivo(String nome, byte[] bytes) {

        try {
            Path path = Paths.get(pastaFotos + nome);
            Files.write(path, bytes);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

    }

}
