package br.com.sipriano.cadastro_clientes.dominio.exceptions;

//è obrigado a tratar
public class CpfInvalidoException extends Exception{

    public CpfInvalidoException(String message) {
        super(message);
    }
}
