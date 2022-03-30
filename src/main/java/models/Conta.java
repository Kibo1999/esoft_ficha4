package models;

import java.util.LinkedList;

public class Conta {
    private float saldo;
    private String nome;
    private LinkedList<Despesa> despesas;

    public Conta(float saldo, String nome, LinkedList<Despesa> despesas) {
        this.saldo = saldo;
        this.nome = nome;
        this.despesas = despesas;
    }

    public void adicionar(Despesa despesa){
        if (despesa == null){
            System.out.println("despesa invalida");
            return;
        }

        despesas.add(despesa);
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

    public LinkedList<Despesa> getDespesas() {
        return despesas;
    }
}
