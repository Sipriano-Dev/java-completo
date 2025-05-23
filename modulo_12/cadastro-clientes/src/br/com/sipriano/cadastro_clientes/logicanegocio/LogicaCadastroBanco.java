package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dados.ClienteDAO;
import br.com.sipriano.cadastro_clientes.dominio.Cliente;

import java.util.Optional;
import java.util.UUID;

public class LogicaCadastroBanco implements Cadastro<Cliente> {

    private ClienteDAO clienteDAO;

    public LogicaCadastroBanco(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public void salvar(Cliente cliente) throws Exception {
        ValidadorCliente.validar(cliente);
        clienteDAO.inserir(cliente);
    }

    @Override
    public Optional<Cliente> buscar(UUID codigo) {
        return Optional.empty();
    }

    @Override
    public void deletar(UUID codigo) {
        clienteDAO.deletar(codigo);
    }

    @Override
    public void atualizar(Cliente cliente) {
        clienteDAO.atualizar(cliente);
    }

    @Override
    public void imprimirRegistros() {
        clienteDAO.listar().forEach(System.out::println);
    }
}
