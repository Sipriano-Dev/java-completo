package br.com.sipriano.cadastro_clientes.dominio.exceptions;
//Não é obrigado a tratar
public class DadoObrigatorioException extends RuntimeException{
    public DadoObrigatorioException(String message) {
        super(message);
    }
}
