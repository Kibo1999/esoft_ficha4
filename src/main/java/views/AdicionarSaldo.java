package views;

import models.DadosApp;
import models.JanelaPai;
import models.Transacao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdicionarSaldo extends JFrame{
    private JTextArea tbSalso;
    private JButton btnAdd;
    private JPanel painelPrincipal;
    private JanelaPai janelaPai;

    public AdicionarSaldo(String title, JanelaPai j){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        janelaPai = j;
        btnAdd.addActionListener(this::add);
    }

    private void add(ActionEvent e){
        DadosApp.DADOS_APP.adicionarTransacao(new Transacao(Float.parseFloat(tbSalso.getText()), new Date(System.currentTimeMillis()), "Inserir saldo"));
        this.setVisible(false);
        janelaPai.reiniciarDados();
    }

}
