import java.util.Comparator;

public class ComparadorDePrecosDesc implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2) {
        if (produto1.getPreco() > produto2.getPreco()) {
            return -1;
        }

        if (produto1.getPreco() == produto2.getPreco()) {
            return 0;
        }

        return 1;

        // Ou
        // return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}
