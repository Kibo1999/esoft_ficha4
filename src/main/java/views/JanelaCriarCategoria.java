package views;

import models.Categoria;
import models.DadosApp;
import models.JanelaPai;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaCriarCategoria extends JFrame{
    private JPanel painelPrincipal;
    private JTextField nomeCat;
    private JTextField descricao;
    private JButton criarCategoria;
    private JanelaPai janelaPai;

    public JanelaCriarCategoria(String title, JanelaPai j){
        super(title);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        janelaPai = j;
        criarCategoria.addActionListener(this::criarCategoria);
    }
    private void criarCategoria(ActionEvent e){
        Categoria c = new Categoria(nomeCat.getText(),descricao.getText());
        DadosApp.DADOS_APP.addCategoria(c);
        janelaPai.reiniciarDados();
    }
}
