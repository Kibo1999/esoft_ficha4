package views;

import models.DadosApp;
import models.JanelaPai;
import models.Transacao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
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
    private JanelaPai janela;

    public JanelaPrincipal(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
        janela = this;
        //TODO Testar
        DadosApp.DADOS_APP.adicionarTransacao(new Transacao(150,new Date(10,5,2022),"Descricao"));
        DadosApp.DADOS_APP.adicionarTransacao(new Transacao(160,new Date(10,5,2022),"Descricao2"));

        btnAddSaldo.addActionListener(this::AdicionarSaldo);
        btnAddDespesas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarDados();
            }
        });
        btnCreateCategoria.addActionListener(this::CriarCategoria);
        btnVerTransacoes.addActionListener(this::ConsultarTransacoes);
    }
    private void AdicionarSaldo(ActionEvent e){
        //abrir janela de inserir saldo
        new AdicionarSaldo("Janel Principal",this).setVisible(true);
        System.out.println("Saldo adicionado com sucesso");
    }
    private void CriarCategoria(ActionEvent e){
        //abrir janela de inserir saldo
        new JanelaCriarCategoria("Janel Criar Categoria",this).setVisible(true);
        System.out.println("Categorias do momento-> ");
        System.out.println(""+DadosApp.DADOS_APP.getCategorias());
    }
    private void ConsultarTransacoes(ActionEvent e){
        //abrir janela de inserir saldo
        new ConsultarTransações("Janel Consultar Transações",this).setVisible(true);
    }

    public void reiniciarDados(){
        lblSaldo.setText(Float.toString(DadosApp.DADOS_APP.getSaldo()));
    }

    public static void main(String[] args) {
        new JanelaPrincipal("Janel Principal").setVisible(true);
    }
}
