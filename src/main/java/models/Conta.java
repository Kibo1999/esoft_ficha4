package models;

import java.util.LinkedList;

public class Conta {
    private float saldo;
    private String nome;
    private LinkedList<Transacao> transacoes;

    public Conta(float saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
        this.transacoes = new LinkedList<>();
    }

    public void adicionar(Despesa despesa){
        if (despesa == null){
            System.out.println("despesa invalida");
            return;
        }

        transacoes.add(despesa);
    }

    public void alterarSaldo(float valor){
        saldo += valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Transacao> getTransacoes() {
        return transacoes;
    }
}
