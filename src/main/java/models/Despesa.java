package models;

import java.util.Date;

public class Despesa extends Transacao{

    private Categoria categoria;
    private Fatura fatura;


    public Despesa(float valor, Date data, String descricao, Categoria categoria, Fatura fatura) {
        super(valor, data, descricao);
        this.categoria = categoria;
        this.fatura = fatura;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
