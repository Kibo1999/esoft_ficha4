package models;

import java.util.Date;
import java.util.LinkedList;

public class Fatura{
    private long contribuinte;
    private LinkedList<Produto> produtos;

    public Fatura(long contribuinte, LinkedList<Produto> produtos) {
        this.contribuinte = contribuinte;
        this.produtos = produtos;
    }

    public long getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }
}
