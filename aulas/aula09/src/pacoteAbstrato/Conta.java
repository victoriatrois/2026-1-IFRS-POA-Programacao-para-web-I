package pacoteAbstrato;

public abstract class Conta {
    private double saldo;
    private int numero;

    public Conta() {
    }

    public Conta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("""
                Conta número %f com saldo de %d
                """, saldo, numero);
    }

    public double credita(double valor) {
        saldo += valor;
        return saldo;
    }

    public abstract double debita(double valor); // métodos abstratos são declarados em classes abstratas
}
