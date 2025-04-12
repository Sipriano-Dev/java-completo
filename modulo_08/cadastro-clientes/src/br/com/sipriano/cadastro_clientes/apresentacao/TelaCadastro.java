package br.com.sipriano.cadastro_clientes.apresentacao;

import javax.swing.*;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCPF;
    private JLabel labelSexo;

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setSize(600, 500);
        setTitle("Cadastro de cliente");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }


}
