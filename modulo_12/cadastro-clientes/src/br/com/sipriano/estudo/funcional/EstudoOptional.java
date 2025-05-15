package br.com.sipriano.estudo.funcional;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;
import br.com.sipriano.cadastro_clientes.dominio.exceptions.CpfInvalidoException;
import br.com.sipriano.cadastro_clientes.logicanegocio.LogicaCadastroMemoria;

import java.util.Optional;
import java.util.UUID;

public class EstudoOptional {


    public static void main(String[] args) throws CpfInvalidoException {

        var possivelCliente = new Cliente();
        possivelCliente.setSexo(TipoSexo.M);

//        if (possivelCliente.isPresent()) {
//            var cliente = possivelCliente.get();
//            if (cliente.getSexo() != null) {
//                System.out.println(cliente.getSexo().getDescricao());
//            }
//        }


        //Forma segura
        var sexoCliente = Optional
                .ofNullable(possivelCliente)
                .map(cliente -> cliente.getSexo())
                .map(tipoSexo -> tipoSexo.getDescricao())
                .orElse(null);

        System.out.println(sexoCliente);

    }

    private static void exemplosIfPresent() {
        var logica = new LogicaCadastroMemoria();
        var cliente = new Cliente();
        cliente.setIdade(26);
        cliente.setNome("Doida");
        cliente.setSexo(TipoSexo.F);
        cliente.setCpf("36434611133");
        cliente.setFoto(new byte[]{});

        var codigoParaBuscar = cliente.getCodigo();

        //logica.salvar(cliente);

        System.out.println("Antes de remover");
        logica.imprimirRegistros();
        logica.deletar(codigoParaBuscar);
        System.out.println("Após remover");
        logica.imprimirRegistros();
    }

    private static void trabalhandoComOrElse() {
        Optional<Cliente> possivelCliente = clienteVazio();
        var cliente = possivelCliente.orElse(new Cliente());

        cliente = possivelCliente.orElseGet(() -> new Cliente());

        cliente = possivelCliente.orElseThrow(() -> new RuntimeException("O cliente não deveria estar vazio!"));

        System.out.println(cliente);
    }

    private static void exemplosBasicosOptional() {
        var cliente = new Cliente();
        cliente.setNome("Alguém");

        Optional<Cliente> possivelCliente = Optional.ofNullable(cliente);

        if (possivelCliente.isPresent()) {
            cliente = possivelCliente.get();
            System.out.println(cliente.getNome());
        }

        var logica = new LogicaCadastroMemoria();
        Cliente clienteEncontrado = logica.buscar(UUID.randomUUID()).get();
        System.out.println(clienteEncontrado.getSexo().getDescricao());
    }

    static Optional<Cliente> clienteVazio() {
        return Optional.empty();
    }

    static Optional<Cliente> clientePopulado() {
        var cliente = new Cliente();
        cliente.setNome("Alguém");
        cliente.setSexo(TipoSexo.F);
        cliente.setCpf("04394174839");
        cliente.setIdade(29);
        //of quando vc tem certeza que não é nulo, como nesse caso
        return Optional.of(cliente);
    }

}
