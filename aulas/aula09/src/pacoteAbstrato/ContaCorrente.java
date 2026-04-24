package pacoteAbstrato;

public class ContaCorrente extends Conta {
    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, int numero) {
        super(saldo, numero);
    }

    public double debita(double valor) {
//        double auxiliar = getSaldo();
//        auxiliar = auxiliar - valor;
//        setSaldo(auxiliar);
//        return getSaldo(); // OU
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }
}
