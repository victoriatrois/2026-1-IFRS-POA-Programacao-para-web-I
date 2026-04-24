package pacoteAbstrato;

public class ContaEspecial extends Conta {
    private double limite;
    public ContaEspecial() {
    }

    public ContaEspecial(double saldo, int numero, double limite) {
        super(saldo, numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return String.format("""
                %s com limite de %f
                """, super.toString(), limite);
    }

    public double debita(double valor) {
        return 0;
    }


}
