import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private int idade;
    private boolean situacao;
    public Pessoa() {}
    public Pessoa(String nome, int idade, boolean situacao) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.situacao = situacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isSituacao() {
        return situacao;
    }
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", situacao=" + situacao + "]";
    }
}
