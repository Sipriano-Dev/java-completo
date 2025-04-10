package sistemabancario;

public class Cliente {

    //static diz que essa var é da classe, não da instancia
    //acessada pela classe sem instanciar
    //tbm usada para constantes
    public static int quantidadeClientes;

    private String cpf;
    private String nome;

    public Cliente() {
        //Adiciona um contador pra cada obj cliente criado
        incrementarCliente();
    }

    public Cliente(String cpf, String nome) {
        incrementarCliente();
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private static void incrementarCliente() {
        //Não usa o this pois o this é pra referenciar o obj
        Cliente.quantidadeClientes++;
    }

}
