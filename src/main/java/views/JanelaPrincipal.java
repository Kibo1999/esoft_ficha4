package views;

import models.DadosApp;
import models.JanelaPai;
import models.Transacao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class JanelaPrincipal extends JFrame implements JanelaPai {
    private JLabel lblSaldo;
    private JButton btnAddDespesas;
    private JButton btnAddSaldo;
    private JButton btnVerTransacoes;
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
        btnAddSaldo.addActionListener(this::AdicionarSaldo);
        btnAddDespesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarDados();
            }
        });
    }
    private void AdicionarSaldo(ActionEvent e){
        //abrir janela de inserir saldo
        new AdicionarSaldo("Janel Principal",this).setVisible(true);
        System.out.println("Saldo adicionado com sucesso");
    }

    public void reiniciarDados(){
        lblSaldo.setText(Float.toString(DadosApp.DADOS_APP.getSaldo()));
    }

    public static void main(String[] args) {
        new JanelaPrincipal("Janel Principal").setVisible(true);
    }
}
