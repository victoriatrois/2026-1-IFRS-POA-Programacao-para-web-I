import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private int id;
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto p) {
        if (this.preco < p.getPreco()) {
            return -1;
        }

        if (this.preco == p.getPreco()) {
            return 0;
        }

        return 1;
    }

    @Override
    public String toString() {
        return String.format("""
                >> Produto %d <<
                %s - %f
                """, id, nome, preco);
    }
}
