package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;

import javax.swing.*;
import java.util.Optional;
import java.util.UUID;

public class LojaCadastroClienteFake implements Cadastro<Cliente> {
    @Override
    public void salvar(Cliente cliente) {
        JOptionPane.showMessageDialog(null, cliente);
    }

    @Override
    public Optional<Cliente> buscar(UUID codigo) {
        return null;
    }

    @Override
    public void deletar(UUID codigo) {

    }

    @Override
    public void atualizar(Cliente cliente) {

    }

    @Override
    public void imprimirRegistros() {

    }
}
