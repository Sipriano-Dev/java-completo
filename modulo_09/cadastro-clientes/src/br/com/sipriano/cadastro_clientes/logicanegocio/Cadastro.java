package br.com.sipriano.cadastro_clientes.logicanegocio;

import java.util.UUID;

public interface Cadastro<TIPO> {

    void salvar(TIPO objCadastrar);

    TIPO buscar(UUID codigo);

    void deletar(UUID codigo);

    void atualizar(TIPO objAtualizar);

    void imprimirRegistros();

}
