package br.com.sipriano.interfaces;

public class Main {
    public static void main(String[] args) {

        Autenticador autenticador = new Autenticador();

        Autenticacao email = new CredencialEmail("fulano@email.com", "1234");
        boolean isEmailAutenticado = autenticador.autenticar(email);

        Autenticacao usuario = new CredencialLogin("Username", "Password");
        boolean isUsuarioAutenticado = autenticador.autenticar(usuario);

        Autenticacao biometrica = new CredencialBiometrica(new byte[]{});
        boolean isBiometriaAutenticado = autenticador.autenticar(biometrica);

        System.out.println("-----------------------");

        CarroEletrico.imprimirAlgo();
        CarroHibrido carroHibrido = new CarroHibrido();
        carroHibrido.fazAlgo();


    }

}
