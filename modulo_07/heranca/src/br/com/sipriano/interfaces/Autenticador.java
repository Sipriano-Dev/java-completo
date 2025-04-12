package br.com.sipriano.interfaces;

public class Autenticador {

    public boolean autenticar(Autenticacao autenticacao) {
        String identificacao = autenticacao.getIdentificacao();

        if (autenticacao.isUsaSenha()) {
            String senha = autenticacao.getSenha();
            //Verifica se a senha da base de dados é igual a
            //senha passada
            return true;
        } else {
            //buscar pessoa no banco de dados através da identificação
            //se enctontra a pessoa retorna true, se não false
            return true;
        }
    }

}
