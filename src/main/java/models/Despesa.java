package models;

import java.util.Date;

public class Despesa extends Transacao{

    private Categoria categoria;


    public Despesa(float valor, Date data, String descricao, Categoria categoria) {
        super(valor, data, descricao);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
