package models;

import java.util.Date;
import java.util.LinkedList;

public enum DadosApp {
    DADOS_APP;
    private Conta conta = new Conta(0,"Nome Conta");

    LinkedList<Transacao> transacoes = new LinkedList<>();

    LinkedList<Categoria> categorias = new LinkedList<>();
    LinkedList<Transacao> transacaos = new LinkedList<>();



    public void adicionarTransacao(Transacao transacao){
        if(transacao instanceof Despesa){
            conta.alterarSaldo(transacao.getValor()*(-1));
        }else{
            conta.alterarSaldo(transacao.getValor());
        }
        transacoes.add(transacao);
    }

    public float getSaldo() {
        return conta.getSaldo();
    }

    public void addCategoria(Categoria c){
        categorias.add(c);
    }

    public LinkedList<Categoria> getCategorias() {
        return new LinkedList<>(categorias);
    }

    public LinkedList<String> getTransacoes(){
        LinkedList<String> lista = new LinkedList<>();
        for (Transacao t : transacoes) {
            lista.add(t.getDescricao()+" "+t.getValor()+"€");
        }
        return new LinkedList<String>(lista);
    }
}
