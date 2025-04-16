package br.com.sipriano.cadastro_clientes.dominio.exceptions;

public class CpfInvalidoException extends Exception{

    public CpfInvalidoException(String message) {
        super(message);
    }
}
