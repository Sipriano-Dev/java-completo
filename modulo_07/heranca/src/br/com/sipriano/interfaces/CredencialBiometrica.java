package br.com.sipriano.interfaces;

public class CredencialBiometrica implements Autenticacao{

    private byte[] fotoRosto;

    public CredencialBiometrica(byte[] fotoRosto) {
        this.fotoRosto = fotoRosto;
    }

    @Override
    public String getIdentificacao() {
        //a nivel de maquina, não é uma String comun
        return new String(this.fotoRosto);
    }

    @Override
    public String getSenha() {
        return null;
    }

    @Override
    public boolean isUsaSenha() {
        return false;
    }
}
