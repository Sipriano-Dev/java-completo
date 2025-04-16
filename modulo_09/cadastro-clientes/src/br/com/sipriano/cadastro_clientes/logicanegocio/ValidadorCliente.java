package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.DadoObrigatorioException;

public class ValidadorCliente {

    public static void validar(Cliente cliente) throws CpfInvalidoException {
        if (cliente.getCpf().length() != 11) {
            throw new CpfInvalidoException("O Cpf deve ter 11 digitos!");
        }

        validarDadosObrigatorios(cliente);

    }

    //Não precisa throws pq é runtime exceptions
    public static void validarDadosObrigatorios(Cliente cliente) {
        if (cliente.getNome() == null) {
            throw new DadoObrigatorioException("Campo nome é obrigatório");
        }

    }

}
