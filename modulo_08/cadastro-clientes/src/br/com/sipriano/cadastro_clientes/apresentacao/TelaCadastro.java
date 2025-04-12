package br.com.sipriano.cadastro_clientes.apresentacao;

import javax.swing.*;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCPF;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCPF;
    private JComboBox<String> campoSexo;

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setSize(600, 500);
        setTitle("Cadastro de cliente");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponentesFoto();
    }

    private void adicionarCampos() {
        //Nome
        labelNome = new JLabel("Nome: ");
        labelNome.setBounds(20, 20, 200, 20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20, 40, 200, 20);
        getContentPane().add(campoNome);

        //CPF
        labelCPF = new JLabel("CPF: ");
        labelCPF.setBounds(20, 60, 200, 20);
        getContentPane().add(labelCPF);

        campoCPF = new JTextField();
        campoCPF.setBounds(20, 80, 200, 20);
        getContentPane().add(campoCPF);

        //Sexo
        labelSexo = new JLabel("Sexo: ");
        labelSexo.setBounds(20, 100, 200, 20);
        getContentPane().add(labelSexo);

        String[] tiposSexo = {"Masculino", "Feminino", "Outros"};
        campoSexo = new JComboBox<>(tiposSexo);
        campoSexo.setBounds(20, 120, 200, 20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes() {

    }

    private void adicionarComponentesFoto() {

    }

}
