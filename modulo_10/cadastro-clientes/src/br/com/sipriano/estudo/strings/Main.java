package br.com.sipriano.estudo.strings;

public class Main {

    static String string = "Manga quase sempre são amarelas";

    public static void main(String[] args) {
        trabalhandoComSubstring();
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

}
