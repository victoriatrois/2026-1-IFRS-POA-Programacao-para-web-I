package aula02;

public class Depertamento {
    private String nome;
    private Funcionario gerente;

    public Depertamento() {
    }

    public Depertamento(String nome, Funcionario gerente) {
        this.nome = nome;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Depertamento{" +
                "nome='" + nome + '\'' +
                ", gerente=" + gerente.toString() +
                '}';
    }
}
