package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;

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
        //Valida dentro da classe lógica
        //Como vai lançar erro, não adiciona o cliente
        //se tiver algo errado
        //Não trata aqui, vc deixa quem chama trata, pois ele ve
        //o erro e resolve, mudando os dados etc, então vc propaga com uma declaração
        ValidadorCliente.validar(cliente);
        lista.add(cliente);
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
