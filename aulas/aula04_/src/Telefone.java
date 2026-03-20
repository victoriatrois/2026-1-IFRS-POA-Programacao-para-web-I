public class Telefone implements Comparable<Telefone>{
    private int ddd;
    private long numero;

    public Telefone() {
    }

    public Telefone(int ddd, long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("""
            Telefone {
            \tDDD: %d
            \tnúmero: %d
            }
        """, ddd, numero);
    }

    @Override
    public int compareTo(Telefone telefone) {
        //  return Long.compare(numero, telefone.getNumero()); OU
        if (numero == telefone.getNumero()) {
            return 0;
        }

        if (numero < telefone.getNumero()) {
            return -1;
        }
        // if (numero > telefone.getNumero())
        return 1;
    }
}
