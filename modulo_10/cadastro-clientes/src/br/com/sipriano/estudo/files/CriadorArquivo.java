package br.com.sipriano.estudo.files;

import java.io.*;

public class CriadorArquivo {

    public static void main(String[] args) {
        CriadorArquivo criadorArquivo = new CriadorArquivo();
        criadorArquivo.lerArquivoTexto();
    }

    private void lerArquivo() {
        File arquivo = new File("D:\\extras\\arquivo.txt");
        System.out.println("Caminho: " + arquivo.getAbsolutePath());
        System.out.println("Nome: " + arquivo.getName());
        System.out.println("Tamanho: " + arquivo.length());
        System.out.println("É arquivo?: " + arquivo.isFile());
    }

    public void lerArquivoTexto(){
        try {
            File arquivo = new File("D:\\extras\\arquivo.txt");

            FileReader fileReader = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha;

            while ( (linha = reader.readLine()) != null ){
                System.out.println(linha);
            }

            reader.close();

        } catch (IOException e){

        }

    }

    public void criarPasta() {
        File file = new File("D:\\extras\\pasta");
        boolean criou = file.mkdir();
        System.out.println("Pasta criada? " + criou);
    }

    private void criarArquivo() {
        try {
            File arquivo = new File("D:\\extras\\arquivo2.txt");
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write("Escrevendo no novo arquivo a partir da ide");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
        }
    }

    private void deletarArquivo() {
        File arquivo = new File("D:\\extras\\arquivo2.txt");
        boolean deletou = arquivo.delete();
        System.out.println("Deletou? " + deletou);
    }


}