public class Cpf {
    private long numero;
    private int digito;

    public Cpf() {}

    public Cpf(long numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }

    public long getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    @Override
    public String toString() {
    return String.format("""
        Cpf: %d-%d
        """, numero, digito);
    }
}
