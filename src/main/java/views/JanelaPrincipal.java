package views;

import javax.swing.*;

public class JanelaPrincipal extends JFrame{
    private JLabel lblSaldo;
    private JButton btnAddDespesas;
    private JButton btnAddSaldo;
    private JButton btnVerDespesas;
    private JButton btnCreateCategoria;
    private JList listDespesas;
    private JPanel painelPrincipal;
    private JPanel paineDespesas;
    private JPanel painelInformacoes;

    public JanelaPrincipal(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
    }

    public static void main(String[] args) {
        new JanelaPrincipal("Janel Principal").setVisible(true);
    }
}
