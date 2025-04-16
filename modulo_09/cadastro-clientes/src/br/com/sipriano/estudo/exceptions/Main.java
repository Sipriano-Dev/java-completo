package br.com.sipriano.estudo.exceptions;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;
import br.com.sipriano.cadastro_clientes.logicanegocio.ValidadorCliente;

public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
//            cliente.setSexo(TipoSexo.F);
            String descricao = cliente.getSexo().getDescricao();
            System.out.println(descricao);
        } catch (NullPointerException e) {
            System.out.println("O sexo estava null!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!");
        }

        Cliente cliente = new Cliente();
        //Cpf ok
        cliente.setCpf("12344543456");
        //Cpf inválido
        cliente.setCpf("1234454346");

        //Uma checked ou vc trata, ou propaga
        try {
            ValidadorCliente.validar(cliente);
            //Exception personalizada
        } catch (CpfInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }

}
