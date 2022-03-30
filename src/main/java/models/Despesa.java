package models;

import java.util.Date;

public class Despesa {
    private float valor;
    private Categoria categoria;
    private Date data;
    private String descricao;

    public Despesa(float valor, Categoria categoria, Date data, String descricao) {
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
