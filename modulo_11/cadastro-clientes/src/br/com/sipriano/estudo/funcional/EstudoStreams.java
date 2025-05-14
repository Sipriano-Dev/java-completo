package br.com.sipriano.estudo.funcional;

import java.util.List;
import java.util.stream.Collectors;

public class EstudoStreams {

    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bia", "Clara", "Gabi");

        //nomes.stream().forEach(nome -> System.out.println(nome));

        //Siplificado, method reference, consumer
        nomes.forEach(System.out::println);
        System.out.println("----------------------------");

        var nomesFiltrados = nomes.stream()
                .filter(nome -> nome.length() < 4)
                .toList();
        nomesFiltrados.forEach(System.out::println);
        System.out.println("----------------------------");

        var mapeados = nomes.stream().map(nome -> nome.charAt(0)).toList();
        mapeados.forEach(System.out::println);
    }

}
