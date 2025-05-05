package br.com.sipriano.estudo.funcional;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.logicanegocio.LogicaCadastroMemoria;

import java.util.Optional;
import java.util.UUID;

public class EstudoOptional {

    public static void main(String[] args) {

        var cliente = new Cliente();
        cliente.setNome("Alguém");

        Optional<Cliente> possivelCliente = Optional.ofNullable(cliente);

        if (possivelCliente.isPresent()) {
            cliente = possivelCliente.get();
            System.out.println(cliente.getNome());
        }

        var logica = new LogicaCadastroMemoria();
        Cliente clienteEncontrdo = logica.buscar(UUID.randomUUID());
        System.out.println(clienteEncontrdo.getSexo().getDescricao());
    }

}
