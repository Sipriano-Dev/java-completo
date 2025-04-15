package br.com.sipriano.cadastro_clientes.apresentacao;

import br.com.sipriano.cadastro_clientes.dominio.Cliente;
import br.com.sipriano.cadastro_clientes.dominio.enums.TipoSexo;
import br.com.sipriano.cadastro_clientes.logicanegocio.Cadastro;
import br.com.sipriano.cadastro_clientes.logicanegocio.LogicaCadastroMemoria;
import br.com.sipriano.cadastro_clientes.logicanegocio.LojaCadastroClienteFake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCPF;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCPF;
    private JComboBox<TipoSexo> campoSexo;

    Cadastro<Cliente> logicaCadastro;

    private JButton botaoSalvar;

    public TelaCadastro() {
        construirTela();
        this.logicaCadastro = new LogicaCadastroMemoria();
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

        //O primeiro valor a aparecer é vazio
        TipoSexo[] tiposSexo = {null, TipoSexo.M, TipoSexo.F, TipoSexo.O};
        campoSexo = new JComboBox<>(tiposSexo);
        campoSexo.setBounds(20, 120, 200, 20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes() {
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20, 160, 70, 20);

        ActionListener acaoBotaoSalvar = botaoSalvarActionListener();
        botaoSalvar.addActionListener(acaoBotaoSalvar);

        getContentPane().add(botaoSalvar);
    }

    private void adicionarComponentesFoto() {

    }

    //esse metodo vai retorna uma implementação de uma classe anônima que conteém um metodo
    //vc usa classe anonima ao inves de cria uma classe normal, pra que a classe tem acesso
    //aos atributos da classe TelaCadastro
    private ActionListener botaoSalvarActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCPF.getText());
                //Fazendo casting pois o JComboBox retorna um Optional
                //e sei que lá só tem os tiposexo
                cliente.setSexo((TipoSexo) campoSexo.getSelectedItem());

                //Instanciar aqui, sempre que salvar um cadastro vai estar instanciando uma lista
                //melhor no construtor dessa classe
                //Cadastro<Cliente> logicaCadastro = new LogicaCadastroMemoria();

                logicaCadastro.salvar(cliente);
                logicaCadastro.imprimirRegistros();
            }
        };
    }

}
