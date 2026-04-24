import pacoteAbstrato.Conta;
import pacoteAbstrato.ContaCorrente;

public static void main(String[] args) {
    Conta c = new Conta();
    Conta c2 = new ContaCorrente();
    Conta vet[] = new Conta[10];
    vet[0] = new Conta();
    vet[1] = new ContaCorrente();
    c.setSaldo(500.0);
}
