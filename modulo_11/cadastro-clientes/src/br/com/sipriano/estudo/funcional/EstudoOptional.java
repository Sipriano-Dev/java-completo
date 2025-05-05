package br.com.sipriano.estudo.funcional;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;
import br.com.sipriano.cadastro_clientes.logicanegocio.LogicaCadastroMemoria;

import java.util.Optional;
import java.util.UUID;

public class EstudoOptional {


    public static void main(String[] args) {

        Optional<Cliente> possivelCliente = clienteVazio();
        //se o cliente estiver vazio vai usar o que ta dentro dos parametros
        //evitando vazio q da null pointer exception
        var cliente = possivelCliente.orElse(new Cliente());

        //Porconta q usa suplier aki, só será instanciado se usar metodo orElseGet, diferente do de cima
        //que vai instancia de qq forma, só não vai passar pro cliente
        cliente = possivelCliente.orElseGet(() -> new Cliente()); //boa prática

        //NoSuchElementException, porém pode ser sobrecarregado pra retorna a exception que vc quiser
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
        Cliente clienteEncontrdo = logica.buscar(UUID.randomUUID());
        System.out.println(clienteEncontrdo.getSexo().getDescricao());
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
