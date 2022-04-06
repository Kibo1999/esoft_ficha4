package models;

import java.util.LinkedList;

public enum RepositorioCategorias {
    SINGLETON;
    private LinkedList<Categoria> categorias;

    public LinkedList<Categoria> getCategorias() {
        return categorias;
    }

    public void adicionarCategoria(Categoria categoria){
        categorias.add(categoria);
    }
}
