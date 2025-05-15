package br.com.sipriano.cadastro_clientes.logicanegocio;

import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;

import java.util.Optional;
import java.util.UUID;

public interface Cadastro<TIPO> {

    void salvar(TIPO objCadastrar) throws Exception;

    Optional<TIPO> buscar(UUID codigo);

    void deletar(UUID codigo);

    void atualizar(TIPO objAtualizar);

    void imprimirRegistros();

}
