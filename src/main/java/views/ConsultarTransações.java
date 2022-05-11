package views;

import models.DadosApp;
import models.JanelaPai;
import models.Transacao;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.LinkedList;

public class ConsultarTransações extends JFrame {
    private JPanel painelPrincipal;
    private JList listaTransacoes;
    private JanelaPai janelaPai;

    public ConsultarTransações(String title, JanelaPai j){
        super(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        janelaPai = j;
        LinkedList<String> ss = DadosApp.DADOS_APP.getTransacoes();
        for ( String s : ss) {
            //adicionar
        }
    }
}
