import java.util.Date;
import java.util.LinkedList;

public class Fatura extends Despesa{
    private long contribuinte;
    private LinkedList<Produto> produtos;

    public Fatura(float valor, Categoria categoria, Date data, String descricao, long contribuinte, LinkedList<Produto> produtos) {
        super(valor, categoria, data, descricao);
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
