public class Cpf implements Comparable<Cpf> {
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

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    @Override
    public String toString() {
    return String.format("""
        Cpf {
        \tnumero: %d
        \tdigito: %d
        }
        """, numero, digito);
    }

    @Override
    public int compareTo(Cpf cpf) {
        // return Long.compare(numero, cpf.getNumero()); OU
        if (numero == cpf.getNumero()) {
            return 0;
        }

        if (numero < cpf.getNumero()) {
            return -1;
        }
        return 1;
    }
}
