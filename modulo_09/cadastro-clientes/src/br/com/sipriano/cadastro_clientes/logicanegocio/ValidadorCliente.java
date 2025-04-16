package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;

public class ValidadorCliente {

    public static void validar(Cliente cliente) throws CpfInvalidoException {
        if (cliente.getCpf().length() != 11) {
            throw new CpfInvalidoException("O Cpf deve ter 11 digitos!");
        }

    }

}
