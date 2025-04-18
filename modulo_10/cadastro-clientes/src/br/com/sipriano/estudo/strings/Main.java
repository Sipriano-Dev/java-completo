package br.com.sipriano.estudo.strings;

public class Main {

    static String string = "Manga quase sempre são amarelas";

    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println("É igual? : " + hello.equalsIgnoreCase("HELLO"));
        System.out.println("Começa com H? " + hello.startsWith("H"));


        String nomeCompleto = "Anderson Sipriano";
        String[] nomeSeparado = nomeCompleto.split(" ");

        System.out.println("Nome: " + nomeSeparado[0]);
        System.out.println("Sobrenome: " + nomeSeparado[1]);


    }

    private static void tamanhoString() {
        int tamanho = string.length();
        System.out.println("Tamanho: " + tamanho);
    }

    private static void pegaCaracteres() {
        char primeiroCaractere = string.charAt(0);
        char ultimoCaractere = string.charAt(string.length() - 1);
        System.out.println("Primeiro e último caractere: " + primeiroCaractere + ", " + ultimoCaractere);
    }

    private static void trabalhandoComSubstring() {
        String pedaco = string.substring(6);
        String outroPedaco = string.substring(6, 11);
        System.out.println("Pedaço da string: " + pedaco);
        System.out.println("Outro Pedaço da string: " + outroPedaco);
    }

    private static void exemplosIndexOf() {
        //index da primeira letra que encontrar
        int index = 0;

        index = string.indexOf("a");
        //-1 -> valor não encontrado
        index = string.indexOf("maçã");
        // a partir da posicção 12 começão a palavra silva
        index = string.indexOf("sempre");

        System.out.println("index " + index);

        String nome = "Anderson Sipriano";
        index = nome.indexOf("Sipriano");

        if (index != -1) {
            System.out.println("Encontrei " + nome);
        } else {
            System.out.println("Nome não encontrado");
        }
    }

    private static void exemplosCase() {
        String nome = "Anderson";
        //Tudo maiúscula
        String nomeCaixaAlta = nome.toUpperCase();
        //Tudo minúscula
        String nomeCaixaBaixa = nome.toLowerCase();
        //Não modifica a original, String é imutavel

        System.out.println(nomeCaixaAlta);
    }

    private static void espacosEmBranco() {
        String nome = " Anderson Sipriano  ";
        //Limpa os espacos das pontas
        String nomeSemEspacos = nome.strip();
        System.out.println(nomeSemEspacos);
    }

    private static void replace() {
        String nome = "Ander son";
        String fruta = "maçã";
        String cpf = "342-535-235-44";
        String novoNome = nome.replace(" ", "");
        String novaFruta = fruta
                .replace("ã", "a")
                .replace("ç", "c");
        String novoCpf = cpf
                .replace(".", "")
                .replace("-", "");

        System.out.println(novoNome);
        System.out.println(novaFruta);
        System.out.println(novoCpf);

    }

}
