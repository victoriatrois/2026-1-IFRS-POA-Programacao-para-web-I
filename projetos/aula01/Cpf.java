package aula01;

public class Cpf {
    private long numero;
    private int digito;

    public Cpf() {}

    public Cpf(long numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }

    @Override
    public String toString() {
        return "Cpf{" +
                "numero=" + numero +
                ", digito=" + digito +
                '}';
    }
}
