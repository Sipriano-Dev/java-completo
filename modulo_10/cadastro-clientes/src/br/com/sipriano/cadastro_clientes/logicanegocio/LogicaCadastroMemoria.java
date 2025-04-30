package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;
import br.com.sipriano.cadastro_clientes.utilitarios.GerenciadorArquivos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LogicaCadastroMemoria implements Cadastro<Cliente> {

    private List<Cliente> lista;

    public LogicaCadastroMemoria() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void salvar(Cliente cliente) throws CpfInvalidoException {

        ValidadorCliente.validar(cliente);
        lista.add(cliente);
        GerenciadorArquivos.persistirArquivo(cliente.getNome() + ".jpg", cliente.getFoto());
    }

    @Override
    public Cliente buscar(UUID codigo) {
        Cliente clienteEncontrado = null;
        for (Cliente c : lista) {
            if (c.getCodigo().equals(codigo)) {
                clienteEncontrado = c;
                break;//Vai parar quando encontra o cliente, finaliza o for, não obrigatorio, mais eficiente
            }
        }
        return clienteEncontrado;
    }

    @Override
    public void deletar(UUID codigo) {
        Cliente clienteEncontrado = this.buscar(codigo);
        if (clienteEncontrado != null) {
            lista.remove(clienteEncontrado);
        }
    }

    @Override
    public void atualizar(Cliente cliente) {
        // faz sentido ao trabalhar com banco de dados
    }

    @Override
    public void imprimirRegistros() {
        System.out.println("Imprimindo " + this.lista.size() + " clientes");
        for (Cliente c : this.lista) {
            System.out.println(c);
        }
    }
}
