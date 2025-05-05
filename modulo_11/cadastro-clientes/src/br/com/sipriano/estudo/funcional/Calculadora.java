package br.com.sipriano.estudo.funcional;

//Somente um metodo abstrato, pode colocar outros defaults ou static
@FunctionalInterface
public interface Calculadora {

    int calcular(int x, int y);

}
