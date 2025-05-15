package br.com.sipriano.estudo.inferenciatipos;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.logicanegocio.LojaCadastroClienteFake;

public class Main {
    public static void main(String[] args) {

        //var só use local, dentro de metodo

        int numero = 10;

        double flutuante;
        flutuante = 10;

        var outroNumero = 15;

        var cliente = new Cliente();

        var logica = new LojaCadastroClienteFake();
    }

}
