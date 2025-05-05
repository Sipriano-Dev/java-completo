package br.com.sipriano.estudo.funcional;

public class Main {

    public static void main(String[] args) {

        //Classe anonima
        Calculadora soma = new Calculadora() {
            @Override
            public int calcular(int x, int y) {
                return x + y;
            }
        };

        //Expressão lambda de uma interface funcional, citada acima
        soma = (x, y) -> x + y;

        Calculadora subtracao = (num1, num2) -> num1 - num2;

        System.out.println("Soma: " + soma.calcular(5, 3));
        System.out.println("Subtração: " + subtracao.calcular(5, 3));
    }

}
