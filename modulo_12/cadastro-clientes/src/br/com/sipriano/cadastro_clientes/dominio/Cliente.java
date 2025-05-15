package br.com.sipriano.cadastro_clientes.dominio;

import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

//Implementa o compare to pra dizer qual criterio de comparação
public class Cliente implements Comparable<Cliente> {

    private UUID codigo;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private Integer idade;
    private byte[] foto;

    public Cliente() {
        this.codigo = UUID.randomUUID();
        System.out.println("Código do cliente: " + this.codigo.toString());
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", foto=" + Arrays.toString(foto) +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;

        return Objects.equals(codigo, cliente.codigo) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && sexo == cliente.sexo;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(codigo);
        result = 31 * result + Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(cpf);
        result = 31 * result + Objects.hashCode(sexo);
        return result;
    }

    /**
     *
     * @param o the object to be compared.
     * @return
     *
     * 0 -> são iguais -> this = o
     * 1 -> é maior -> this > o
     * -1 -> é menor this < o
     */
    @Override
    public int compareTo(Cliente o) {
        //Compara por nome, String compara por ordem alfabetica
        //Usa um segundo fator se for igual o primeiro
        int fator = this.nome.compareTo(o.getNome());
        //if simples com só um elemento não precisa de chaves
        if (fator == 0) fator = this.cpf.compareTo(o.getCpf());

        return fator;
    }
}
