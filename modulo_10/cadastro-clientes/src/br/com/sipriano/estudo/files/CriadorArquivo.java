package br.com.sipriano.estudo.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriadorArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("D:\\extras\\arquivo.txt");
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("Escrevendo no novo arquivo");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
        }
    }
}
