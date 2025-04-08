import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setTitle("Meu Primeiro Programa");
        janela.setSize(500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 20, 50, 20);

        JTextField campoTextoNome = new JTextField();
        campoTextoNome.setBounds(20, 40, 200, 20);

        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(225, 40, 72, 20);
        botaoEnviar.addActionListener(event -> {
            String nomeDigitado = campoTextoNome.getText();
            JOptionPane.showMessageDialog(janela, "Bem Vindo " + nomeDigitado);
        });

        janela.setLayout(null); //Limpa o layout para poder configurar
        janela.getContentPane().add(labelNome);
        janela.getContentPane().add(campoTextoNome);
        janela.getContentPane().add(botaoEnviar);


        janela.setVisible(true); //Torna a janela visível
    }
}