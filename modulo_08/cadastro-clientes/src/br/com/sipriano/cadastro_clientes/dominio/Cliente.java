package br.com.sipriano.cadastro_clientes.dominio;

import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;

import java.util.UUID;

public class Cliente {

    private UUID codigo;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private byte[] foto;

    public Cliente() {
        this.codigo = UUID.randomUUID();
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}
