package models;

import java.util.LinkedList;

public enum DadosApp {
    DADOS_APP;
    private Conta conta = new Conta(0,"Nome Conta");

    LinkedList<Transacao> transacoes = new LinkedList<>();

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
}
